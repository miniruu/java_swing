package valueObject;

import java.util.Scanner;

import controller.CJoin;
import controller.CLogin;

public class OLogin {
	private Scanner scan;
	private String id;
	private String password;
	private String department;
	private String name;
	private String address;
	private String hakgwa;
	
	private CLogin cLogin;

	private CJoin cJoin;
	public OLogin(Scanner scan) {
		this.cLogin = new CLogin();
		this.scan = scan;
	}


	public OLogin() {}


	public void read() {
		OHwewon oHwewon;
		oHwewon = new OHwewon(id,null, null, null,null,null);
		this.cJoin.readHwewon(oHwewon);
		System.out.println("위의 정보로 로그인 되었습니다.");

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}


}