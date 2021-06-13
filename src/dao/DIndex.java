package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import model.MIndex;
import valueObject.OIndex;

public class DIndex {
	MIndex mIndex = new MIndex();
	
	public DIndex() {}
	
	public Vector<OIndex> readAll(String fileName) {
		
		Vector<OIndex> indices = new Vector<OIndex>();
		
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			while(mIndex.read(scan)){
				OIndex oIndex = new OIndex();
				oIndex.set(mIndex);
				indices.add(oIndex);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return indices;
	}
}