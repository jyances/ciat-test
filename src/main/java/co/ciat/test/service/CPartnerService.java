package co.ciat.test.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import co.ciat.test.dao.CPartnerFileDao;
import co.ciat.test.model.CPartner;
import co.ciat.test.model.CountryDto;

/**
 * Service that should be an ejb - Singleton meanwhile
 * @author jyances
 *
 */
public class CPartnerService implements PartnerService {

	private static final Logger logger = LogManager.getLogger();	
	private static CPartnerService instance = null;
    
	private static List<CPartner> partners;

    static {
    	partners = new ArrayList<CPartner>();
    	partners.add(new CPartner(1, "John", "Doe", "asd","asd", "asd"));
    	partners.add(new CPartner(2, "Bob", "Smith", "asd","asd", "asd"));        
    }
	
	private CPartnerFileDao dao;
	
	
	/**
	 * Singleton 
	 * @return
	 */
	public static CPartnerService getInstance() {
	      if(instance == null) {
	         instance = new CPartnerService();
	      }
	      return instance;
	   }
	
    protected CPartnerService() {
        this.dao = new CPartnerFileDao();
    }

    /**
     * 
     */
	public List<CPartner> findAllPartners() { 
		return dao.findAll();
	}

	/**
	 * Creates the entity into the fileDao
	 */
	public void save(CPartner entity) {
		try {
			dao.createJson(entity);
		} catch (IOException e) {
			logger.error("There was an error persisting the partner", e);
		}		
	}

	/**
	 * 
	 */
	public List<CountryDto> findAllCountriers() {
		URL url;
		List<CountryDto> countries = new ArrayList<CountryDto>();
		Gson gson = new Gson();
		try {
			url = new URL("https://restcountries.eu/rest/v2/all");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		    conn.setRequestMethod("GET");
		    conn.setRequestProperty("Accept", "application/json");	
		    
		    if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	        String output;        
	        while ((output = br.readLine()) != null) {
	            JsonArray json = (JsonArray) new JsonParser().parse(output);
	            for (JsonElement element : json) {
	                JsonObject obj = element.getAsJsonObject();
	                CountryDto country = gson.fromJson(obj, CountryDto.class);
		            countries.add(country);
	            }	           
	        }

	        conn.disconnect();
		} catch (Exception e) {
			logger.error("There was an error querying the country list", e);
		}	   
		
		return countries;
	}
}
