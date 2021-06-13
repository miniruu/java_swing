package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import constants.Config.FVall;
import valueObject.OHwewon;
import valueObject.OLecture;

public class MLecture {
	private String id;
	private String lectureName;
	private String profName;
	private String credits;
	private String time;

	public MLecture() {
	}

	public boolean read(Scanner scan) {
		if (scan.hasNext()) {
			this.id = scan.next();
			this.lectureName = scan.next();
			this.profName = scan.next();
			this.credits = scan.next();
			this.time = scan.next();
			return true;
		}
		return false;
	}

	public int saveAll(OHwewon oHwewon, Vector<OLecture> mylectures, String PATH) {
		try {
			OLecture lecture =  mylectures.get(0);
			Vector<OLecture> alreadyLecs = this.readAll(PATH+"/"+oHwewon.getId());
			//이미 신청한 강좌는 -1리턴
			for(int i=0; i < alreadyLecs.size(); i++){
				if(alreadyLecs.get(i).getId().equals(lecture.getId()))
					return -1;
			}
			int sum=0;
			int maxCredit = FVall.MAXCREDIT;
			//수강 가능학점 넘으면 0리턴
			for(int i=0; i < alreadyLecs.size(); i++) {
				sum += Integer.parseInt(alreadyLecs.get(i).getCredits());
			}
			if(sum + Integer.parseInt(lecture.getCredits()) > FVall.MAXCREDIT){
				return 0;
			}
			File file = new File(PATH+"/"+oHwewon.getId());
			Scanner scan2 = new Scanner(file);
			FileWriter fileWriter2;
			fileWriter2 = new FileWriter(file, true);
			BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
			
			for (int i = 0; i < mylectures.size(); i++) {
				OLecture lec  = mylectures.get(i);
				String lecInfo = lec.getId()+" "+lec.getLectureName()+" "+lec.getProfName()+" "+lec.getCredits()+" "+lec.getTime();
				bufferedWriter2.write(lecInfo);
				bufferedWriter2.newLine();
			}
			bufferedWriter2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;

	}

	
	public Vector<OLecture> readAll(String fileName){
		Vector<OLecture> lectures = new Vector<OLecture>();
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			while (this.read(scan)) {
				OLecture oLecture = new OLecture();//OLecture는 잠깐 만들어서 버리는 것.
				oLecture.set(this);
				lectures.add(oLecture);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return lectures;
	}
	
	public boolean adminCreate(FileWriter fileWriter, OLecture newLecture){
		this.set(newLecture);
		String lectureInfo = "";
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			lectureInfo += this.getId() + " " + this.getLectureName() + " " + this.getProfName() + " " + this.getCredits()
					+ " " + this.getTime() +"\n";
			bufferedWriter.write("\r\n");
			bufferedWriter.write(lectureInfo);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();

		} catch (IOException e){
			e.printStackTrace();
		}
		return true;
	}

	private void set(OLecture newLecture) {
		this.id = newLecture.getId();
		this.lectureName = newLecture.getLectureName();
		this.profName = newLecture.getProfName();
		this.credits = newLecture.getCredits();
		this.time = newLecture.getTime();
	}
	
//	public void readAllLecs(String hwewonId, String PATH, Vector<OLecture> allLecs) {
//		try {
//			File file = new File("src/data/"+PATH+hwewonId);
//			Scanner scan = new Scanner(file);
//			FileWriter fileWriter;
//			fileWriter = new FileWriter(file);
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//			while(scan.hasNext()){
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLecturename(String lecturename) {
		this.lectureName = lecturename;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}





}