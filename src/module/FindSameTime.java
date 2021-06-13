package module;

import java.util.Vector;

import constants.others.SameTimeLectureArrayList;
import valueObject.OLecture;

public class FindSameTime {
	
	public static SameTimeLectureArrayList find(Vector<OLecture> times){
		
		Vector<String> times_ = new Vector<String>();
		SameTimeLectureArrayList arr = new SameTimeLectureArrayList();
		for(int i=0; i<times.size(); i++){
			
			String str = times.get(i).getTime();
			//요일이 안나와있으면 건너뛴다. 시간이 제대로 나오지 않거나 data순서가 다른 파일들과 다르다면 건너 뛴다.
			if(str.charAt(0)<57 || str.length()<9)
				continue;
			//':'는 없앤다
			if(str.contains(":"))
				str = str.replace(":", "");
			if(str.contains("~"))
				str = str.replace("~", "-");
			
			String processedTime = "";
			
			//월수1030-1145 처럼 두 날짜가 이어 써있는 경우
			if(str.charAt(0) > 57 && str.charAt(1) > 57){
				processedTime = str.charAt(0) + str.substring(2, str.length())+","+ str.charAt(1) + str.substring(2, str.length());
				
			//월1030-1145처럼 날짜는 하나만 있는 경우
			}else if(str.charAt(0) > 57 && str.charAt(1) < 57){
				processedTime = str.charAt(0) + str.substring(1, str.length())+","+ str.charAt(0) + str.substring(1, str.length());
				
			}
			else if(str.length() > 12){
				processedTime = str;
				//System.out.println(newTime);
			}
			times_.add(processedTime);
		}
		for(int i=0; i<times_.size(); i++){
			for(int j=i+1; j<times_.size(); j++){
				if(times_.get(i).charAt(0)==times_.get(j).charAt(0)){
					String[] lec1 = times_.get(i).split("-");
					String[] lec2 = times_.get(j).split("-");
					
					String lec1_start = lec1[0].substring(1, 5);
					String lec1_end = lec1[1].substring(0,4);
					String lec2_start = lec2[0].substring(1, 5);
					String lec2_end = lec2[1].substring(0, 4);

					if((Integer.parseInt(lec2_start) <= Integer.parseInt(lec1_end)) && (Integer.parseInt(lec1_start) <= Integer.parseInt(lec2_end))){
						arr.add(times.get(i), times.get(j));
					}
				}
			}
		}
		return arr;
	}
}
