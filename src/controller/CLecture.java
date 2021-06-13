package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import constants.Config.Path;
import dao.DLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class CLecture {
	
	private DLecture dLecture;
	
	public CLecture() {
		this.dLecture = new DLecture();
	}

	public Vector<OLecture> getAll(String fileName) {
		Vector<OLecture> lectures = this.dLecture.readAll(fileName);
		return lectures;
	}

	public Vector<OLecture> show(String fileName){
		
		Vector<OLecture> lectures = getAll(fileName); 
		return lectures;
	}
//    
	public int saveAllLecs(OHwewon oHwewon, Vector<OLecture> mylectures, String PATH){//회원(회원 정보), 저장할 강의들, 저장할 경로
		return dLecture.saveAllLecs(oHwewon, mylectures, PATH);

	}
	
	public Vector<OLecture> readAllLecs(String HwewonId, String PATH){
		PATH = PATH+HwewonId;
		return dLecture.readAllLecs(PATH);
	}
	
	public void carryLecs(OHwewon oHwewon, String nowPATH, String objPATH, Vector<OLecture> myLectures){
		dLecture.saveAllLecs(oHwewon, myLectures, objPATH);
	}
	
	public boolean deleteLecture(OHwewon oHwewon, String path, String deletedLectureID) {
		
		String fileName = Path.pPath+path+"/"+oHwewon.getId();
		 this.dLecture.deleteLecture(fileName, deletedLectureID);
		 return true;
	}
	
	public boolean adminCreate(String path, OLecture newLecture){
		
		boolean success = true;
		try {
			File file = new File(path);
			FileWriter fileWriter;
			fileWriter = new FileWriter(path, true);
			success = dLecture.adminCreate(fileWriter, newLecture);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
	}
	public boolean deleteLecture(String fileName, String deleteLectureID){
		return this.dLecture.deleteLecture(fileName, deleteLectureID);
	}
	
	public boolean adminUpdate(String fileName,String deleteLectureID, String id, String lectureName, String profName, String credits, String time) {

		OLecture newLecture = new OLecture(id, lectureName, profName, credits, time);
		
		if (deleteLecture(fileName, deleteLectureID)) 
			return this.adminCreate(fileName, newLecture);
		else
			return false;
//			boolean success = this.adminCreate(fileName, newLecture);
//			if(success)
//				System.out.println("강좌 수정에 성공하셨습니다.");
//			else 
//				System.out.println("강좌 수정에 실패하였습니다.");
//		}
//		else
//			System.out.println("강좌 수정에 실패하였습니다.");
	}
	
//	public void adminUpdate(String message){
//		System.out.println();
//		System.out.println("---- 강좌"+message+"을 시작하겠습니다. ----");
//		System.out.println();
//		String campusFileName = show(PATHNAME+"campus" ,"캠퍼스를 ");//캠퍼스 선택
//		System.out.println();
//		String collegeFileName = show(PATHNAME+campusFileName, "대학을 ");// 단과 선택
//		System.out.println();
//		String departmentFileName = show(PATHNAME+collegeFileName, "학과를 ");// 부서 선택
//		System.out.println();
//		this.vLecture.adminUpdate(PATHNAME+departmentFileName);
//	}
}
