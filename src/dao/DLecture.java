package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import model.MLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class DLecture {
	MLecture mLecture;

	public DLecture() {
		this.mLecture = new MLecture();
	}

	public Vector<OLecture> readAll(String fileName){

		Vector<OLecture> lectures = new Vector<OLecture>();

		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			while (mLecture.read(scan)) {
				OLecture oLecture = new OLecture();//OLecture는 잠깐 만들어서 버리는 것.
				oLecture.set(mLecture);
				lectures.add(oLecture);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return lectures;
	}

	/* fileName을 보내면 그래도 저장하도록 수정*/
//	public int savaAllLecs(OHwewon oHwewon, Vector<OLecture> mylectures, String PATH) {
//		return mLecture.saveAll(oHwewon, mylectures, PATH);
//	}

	public Vector<OLecture> readAllLecs(String fileName) {
		return this.mLecture.readAll(fileName);
	}
	
	public boolean deleteLecture(String fileName, String deleteLectureID) {

		Path path = Paths.get(fileName);
		Charset cs = StandardCharsets.UTF_8;
		List<String> list = new ArrayList<String>();
		List<String> nlist = new ArrayList<String>();
		try {
			list = Files.readAllLines(path, cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String readLine:list) {
			if(readLine.contains(deleteLectureID)) {
				continue;
			}
			else {
				nlist.add(readLine);
			}
		}
		try {
			File file = new File(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
			
			if(file.isFile() && file.canWrite()) {
				for(String readLine : nlist) {
					bufferedWriter.write(readLine);
					bufferedWriter.newLine();
				}
				bufferedWriter.close();
				return true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean adminCreate(FileWriter fileWriter, OLecture newLecture) {
		boolean success = mLecture.adminCreate(fileWriter, newLecture);
		return success;
	}

	public int saveAllLecs(OHwewon oHwewon, Vector<OLecture> mylectures, String pATH) {
		return mLecture.saveAll(oHwewon, mylectures, pATH);
		
	}
}
