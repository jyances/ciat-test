package co.ciat.test.business;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import co.ciat.test.model.CPartner;
import co.ciat.test.model.CountryDto;
import co.ciat.test.model.TypeEnum;
import co.ciat.test.service.CPartnerService;
import co.ciat.test.service.PartnerService;



/**
 * Action for partners registration
 * @author jyances
 *
 */
public class PartnerAction extends ActionSupport implements Preparable  {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger();
	
	private PartnerService service = CPartnerService.getInstance();  
	
    private CPartner partner;
    private List<CPartner> partners;  
    private List<CountryDto> countries;
    private List<TypeEnum> types;
  
	public String execute() { 	
		return SUCCESS;
	}
    
	/**
     * Loads employee data in case of editing, and loads departments in any case,
     * to be displayed even in case validation fails.
     * 
     * @throws Exception 
     */	
    public void prepare() throws Exception {           	
    	logger.info("New user registering");
    }
    
    public String register() throws Exception {           	
    	countries = service.findAllCountriers();
    	types = Arrays.asList(TypeEnum.values());
	    return SUCCESS;
    }    

    public String save() {
    	if(partner != null && partner.getName() != null){
    		service.save(partner);
    		return SUCCESS;
    	}    	
        return ERROR;
    }
   
    
    public String list() {
    	partners = service.findAllPartners();
        return SUCCESS;
    }
   
	public List<CPartner> getPartners() {
		return partners;
	}

	public void setPartners(List<CPartner> partners) {
		this.partners = partners;
	}
	
	public CPartner getPartner() {
		return partner;
	}
	
	public void setPartner(CPartner partner) {
		this.partner = partner;
	}

	public List<CountryDto> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDto> countries) {
		this.countries = countries;
	}

	public List<TypeEnum> getTypes() {
		return types;
	}

	public void setTypes(List<TypeEnum> types) {
		this.types = types;
	}

}
