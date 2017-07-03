package co.ciat.test.dao;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.SystemUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import co.ciat.test.model.CPartner;

/**
 * Dao to persist into plain text files 
 * @author jyances
 *
 */
public class CPartnerFileDao implements GenericDao<CPartner> {
        

	private static final Logger logger = LogManager.getLogger();	
	private static final String UNIX_TMP_PARTNER_TXT = "/tmp/partner.txt";
	private static final String WINDOWS_TMP_PARTNER_TXT = "C:\\temp\\partner.txt";
	private Gson gson = new Gson();
	
	/**
	 * 
	 */
	public void create(CPartner entity) throws IOException{		
		Path p = Paths.get(SystemUtils.IS_OS_LINUX? UNIX_TMP_PARTNER_TXT : WINDOWS_TMP_PARTNER_TXT);		
		String line = entity.toString() + System.lineSeparator();
		Files.write(p, line.getBytes(), StandardOpenOption.APPEND);
				
	}
	
	/**
	 * 
	 */
	public void createJson(CPartner entity) throws IOException{		
		Path p = Paths.get(SystemUtils.IS_OS_LINUX? UNIX_TMP_PARTNER_TXT : WINDOWS_TMP_PARTNER_TXT);	
		String json = gson.toJson(entity) + System.lineSeparator();
		Files.write(p, json.getBytes(), StandardOpenOption.APPEND);
				
	}
	
	/**
	 * Clean binary serialize object
	 * @author jyances
	 */
	public void createBin(CPartner entity) throws IOException{
		FileOutputStream fileOut = null;
		fileOut = new FileOutputStream(SystemUtils.IS_OS_LINUX? UNIX_TMP_PARTNER_TXT : WINDOWS_TMP_PARTNER_TXT);
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(entity);
		         out.close();
		         fileOut.close();
	}

	public Boolean update(CPartner entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(CPartner entity) {
		// TODO Auto-generated method stub
		
	}

	public CPartner find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CPartner> findAll() {
		BufferedReader br = null;
		FileReader fr = null;
		List<CPartner> partners = new ArrayList<CPartner>();
		try {
			fr = new FileReader(SystemUtils.IS_OS_LINUX? UNIX_TMP_PARTNER_TXT : WINDOWS_TMP_PARTNER_TXT);
			br = new BufferedReader(fr);
			String sCurrentLine;
			br = new BufferedReader(new FileReader(SystemUtils.IS_OS_LINUX? UNIX_TMP_PARTNER_TXT : WINDOWS_TMP_PARTNER_TXT));

			while ((sCurrentLine = br.readLine()) != null) {
				CPartner partner = gson.fromJson(sCurrentLine, CPartner.class);	            
				partners.add(partner);				
			}
		} catch (Exception e) {
			logger.error("Error reading the file of partners", e);
		} 
			
		return partners;
	}



}
