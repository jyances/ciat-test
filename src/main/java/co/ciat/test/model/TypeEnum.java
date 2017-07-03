package co.ciat.test.model;

/**
 * Enumeration for types
 * @author jyances
 *
 */

public enum TypeEnum {
					
	ACADEMIC("Academic Institution"),
	DONOR("Donor"),
	NON_GOVERMMENTAL("Non-Govermmental Organization"),
	RESEARCH("Research Institution");
	
	private String name;
			
			
	private TypeEnum(String name){
		this.name = name;		
	}
		
	public String getName() {
		return name;
	}


}
