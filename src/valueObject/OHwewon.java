package valueObject;

import model.MHwewon;

public class OHwewon {

	private String id;
	private String password;
	private String department;
	private String name;
	private String address;
	private String hwakgwa;
	
	public OHwewon() {}
	
	public OHwewon(String id, String password, String department, String name, String address, String hwakgwa) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.hwakgwa = hwakgwa;
	}
	
	public void setOHwewon(String id, String password, String department, String name, String address, String hwakgwa) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.password = password;
		this.address = address;
		this.hwakgwa = hwakgwa;
	}
	
	public void set(MHwewon mHwewon) {
		this.id = mHwewon.getId();
		this.name =  mHwewon.getName();
		this.department =  mHwewon.getDepartment();
		this.password =  mHwewon.getPassword();
		this.address =  mHwewon.getAddress();
		this.hwakgwa =  mHwewon.getHwakgwa();
		
	}
	
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getHwakgwa() {
		return hwakgwa;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHwakgwa(String hwakgwa) {
		this.hwakgwa = hwakgwa;
	}
	
}