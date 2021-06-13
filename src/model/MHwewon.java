package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import valueObject.OHwewon;

public class MHwewon {
	private String fileName = "src/data/std/stdAll";
	private String id;
	private String password;
	private String department;
	private String name;
	private String address;
	private String hwakgwa;

	public MHwewon() {}

	public MHwewon(String id, String password, String department, String name, String address, String hwakgwa) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.department = department;
		this.address = address;
		this.hwakgwa = hwakgwa;
	}

	private void set(OHwewon oHwewon) {
		this.id = oHwewon.getId();
		this.password = oHwewon.getPassword();
		this.department = oHwewon.getDepartment();
		this.name = oHwewon.getName();
		this.hwakgwa = oHwewon.getHwakgwa();
		this.address = oHwewon.getAddress();
	}

	public String save(FileWriter fileWriter, OHwewon oHwewon) {

		this.set(oHwewon);//MHwewon을 만들었음
		try {
			BufferedWriter bw = new BufferedWriter(fileWriter);
			
			//M회원을 집어 넣기
			bw.write(this.getId());
			bw.newLine();
			bw.flush();
			bw.write(this.getPassword());
			bw.newLine();
			bw.flush();
			bw.write( this.getName());
			bw.newLine();
			bw.flush();
			bw.write(this.getAddress());
			bw.newLine();
			bw.flush();
			bw.write(this.getHwakgwa());
			bw.newLine();
			bw.flush();
			bw.write(this.getDepartment());
			bw.newLine();
			bw.newLine();
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 회원가입시 stdLecs에 학생id 파일추가
		File suganFile = new File("src/data/stdLecs/" + oHwewon.getId());
		if (!suganFile.exists()) {
			try {
				suganFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 회원가입시 stdLecs에 학생id 파일추가
		File miridamgiFile = new File("src/data/stdBag/" + oHwewon.getId());
		if (!miridamgiFile.exists()) {
			try {
				miridamgiFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return this.getId();
	}

	public boolean read(OHwewon oHwewon, Scanner scan) {
		File file = new File(fileName);
		this.set(oHwewon);
		String id = this.getId();
		if (file.exists()) {
			BufferedReader bufferedReader;
			try {
				bufferedReader = new BufferedReader(new FileReader(file));
				String info = null;
				while ((info = bufferedReader.readLine()) != null) {
					String ID = info;
					if (ID == id) {
						System.out.println(ID);
						for (int i = 0; i < 5; i++) {
							System.out.println(bufferedReader.readLine());
						}
						break;
					}

				}
				bufferedReader.close();
				return true;
				
			} catch (IOException e) {
				return false;
			}
		}
		return false;
	}

	public void read(String hwewonID) {
		File file = new File(fileName);
		if (file.exists()) {
			BufferedReader bufferedReader;
			try {
				bufferedReader = new BufferedReader(new FileReader(file));
				String info = null;
				while (bufferedReader.readLine() == hwewonID) {
				}
				for (int i = 0; i < 5; i++) {
					info += bufferedReader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean read(Scanner scan) {
		if (scan.hasNext()){
			this.id = scan.next();
			this.password = scan.next();
			this.name = scan.next();
			this.hwakgwa = scan.next();
			this.address = scan.next();
			this.department = scan.next();

			return true;
		}
		return false;
	}

	public String getId() {
		return id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
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