package controller;

import java.io.FileWriter;
import java.io.IOException;

import dao.DJoin;
import valueObject.OHwewon;

public class CJoin {
	private String fileName = "src/data/std/stdAll";
	private DJoin dJoin;

	public CJoin() {
		this.dJoin = new DJoin();		
	}

	public boolean readHwewon(OHwewon oHwewon){
		dJoin.read(oHwewon);
		return true;
	}
	public boolean saveHwewon(OHwewon oHwewon){
		try {
			FileWriter fileWriter;
			fileWriter = new FileWriter(fileName, true);
			String hwewonID = dJoin.save(fileWriter, oHwewon);
			if(dJoin.read(hwewonID) != null) {
				return true;				
			}else {
				return false;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean show(String id,String password, String department, String name,String address,String hakgwa ) {
		OHwewon oHwewon;
		oHwewon = new OHwewon();
		oHwewon.setOHwewon(id, password, department, name, address, hakgwa );
		if((saveHwewon(oHwewon)) && (readHwewon(oHwewon))) {
			return true;
		}else {
			return false;
		}
		
	}
}
