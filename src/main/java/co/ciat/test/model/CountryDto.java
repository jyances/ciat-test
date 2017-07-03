package co.ciat.test.model;

/**
 * Dto to save country list
 * @author jyances
 *
 */
public class CountryDto {
	private String name;
	private String alpha2Code;
	private String region;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
