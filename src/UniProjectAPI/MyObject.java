package UniProjectAPI;

public class MyObject {

	// Define your university object properties here
	private  String state_province;
	private  String domains[];
	private  String country;
	private  String web_pages[];
	private  String name;
	private  String alpha_two_code;
	
	
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	public String[] getDomains() {
		return domains;
	}
	public void setDomains(String[] domains) {
		this.domains = domains;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getWeb_pages() {
		return web_pages;
	}
	public void setWeb_pages(String[] web_pages) {
		this.web_pages = web_pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha_two_code() {
		return alpha_two_code;
	}
	public void setAlpha_two_code(String alpha_two_code) {
		this.alpha_two_code = alpha_two_code;
	}
	
}
