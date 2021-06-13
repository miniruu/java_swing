package constants.others;

import java.util.ArrayList;

import valueObject.OLecture;

public class SameTimeLectureArrayList {
	public ArrayList<SameLecture> arr = new ArrayList<SameLecture>();
	
	public void add(OLecture lec1, OLecture lec2){
		arr.add(new SameLecture(lec1, lec2));
	}
}
