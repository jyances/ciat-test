package co.ciat.test.model;

import java.io.Serializable;

/**
 * Partner Entity, is not mapped to JPA due to req: plain text file storage
 * @author jyances
 *
 */
public class CPartner implements Serializable {

    private Integer id;
	
	private String name;
	
	private String headquarter;
	
	private String acronym;
	
	private String type;

	private String country;
	
	private String city;
	
	private String website;
	
	private boolean branch;

	public CPartner() {
	}
	
	public CPartner(Integer id, String type, String country, String website, String acronyn, String headquarter) {
		this.id = id;
		this.type = type;
		this.country = country;
		this.website = website;
		this.acronym = acronyn;
		this.headquarter = headquarter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer()
				.append(this.getId()).append(",")
				.append(this.getName()).append(",")
				.append(this.getCountry()).append(",")
				.append(this.getHeadquarter()).append(",")
				.append(this.getAcronym());
		return buf.toString();
		
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public boolean isBranch() {
		return branch;
	}

	public void setBranch(boolean branch) {
		this.branch = branch;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}
