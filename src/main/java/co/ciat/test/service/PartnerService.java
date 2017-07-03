package co.ciat.test.service;

import java.util.List;

import co.ciat.test.model.CPartner;
import co.ciat.test.model.CountryDto;

/**
 * 
 * @author jyances
 *
 */
public interface PartnerService {

    public List<CPartner> findAllPartners();
    
    public void save(CPartner entity);
    
    public List<CountryDto> findAllCountriers();

}
