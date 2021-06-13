package model;

import java.util.Scanner;

public class MIndex {
	//private Scanner scan;
	private String id;
	private String password;
	private String department;
	private String name;
	private String address;
	private String hakgwa;
	private String fileName;
	
	public MIndex() {}

	public boolean read(Scanner scan) {
		if(scan.hasNext()) {
			this.id = scan.next();
//			System.out.println("this.id = scan.next(): "+this.id);
			this.name = scan.next();
//			System.out.println("this.id = scan.next(): "+this.name);
			this.fileName = scan.next();
//			System.out.println("this.id = scan.next(): "+this.fileName);
			return true;
		}
		return false;
	}
	public String getFileName() {
		return this.fileName;
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