package controller;

import java.util.Vector;

import dao.DIndex;
import valueObject.OIndex;

public class CIndex {
	
	private DIndex dIndex;
	
	public CIndex() {
		this.dIndex = new DIndex();
	}
	
	public String show(String fileName, String id){
		Vector<OIndex> indices = getAll(fileName); 
		for(OIndex index: indices){
			if(index.getId().equals(id)){
				return index.getFileName();
			}
		}
		return id;
	}
	
	public Vector<OIndex> getAll(String fileName) {
		Vector<OIndex> indices = this.dIndex.readAll(fileName);
		return indices;
	}
}
