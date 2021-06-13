package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import constants.Config.FVall;
import constants.Config.Path;
import model.MHwewon;
import valueObject.OHwewon;

public class DJoin {
	MHwewon mHwewon = new MHwewon();//여기에 있어야 연결이 되는 것임. Association을 만든다
	public DJoin() {}
	
	public OHwewon read(String id) {
		try {
			File file = new File(Path.stdsPath);
			Scanner scan = new Scanner(file);
			while(mHwewon.read(scan)){
				if(mHwewon.getId().equals(id)){
					OHwewon oHwewon = new OHwewon();
					oHwewon.set(mHwewon);
					return oHwewon;
				}
			}
			scan.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public String save(FileWriter fileWriter, OHwewon oHwewon) {
		String hwewonID = mHwewon.save(fileWriter, oHwewon);
		return hwewonID;
	}

	//완료
	public boolean read(OHwewon oHwewon) {
		try {
			File file = new File(Path.stdsPath);
			Scanner scan = new Scanner(file);
			return mHwewon.read(oHwewon, scan);
		} catch (FileNotFoundException e) {
			return false;
		}
		
	}
}