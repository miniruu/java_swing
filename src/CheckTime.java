import java.time.LocalDateTime;
import java.util.Date;
import java.util.Vector;

public class CheckTime {

//	2200 중급회계 김기영 3 화1500-1615,목1500-1615
//	2201 재무분석 심명화 3 월1630-1745,수1630-1745
//	1110 전기전자1 김민수 3 월수0900-1015
//	1111 전기전자2 김민수 3 월수1030-1145
//	1010 영어1 여인욱 3 월수1030-1145
//	3 정책학원론 이시연 3 목0900-1145
	
	//이중for문 사용. 제일 위의 강의 부터 아래로 같은 요일인 강의 있는지 확인.
/*	for(int i = i<lectures.length; i++) {
		for(int j=i+1; j<lectures.length ; j++) {
			if(lectures[i]의 날짜 == lectures[j]의 날짜) {
				
				lectures[i]의 시간과 lectures[j]의 시간을 빼내는 로직 필요.
				
				시간 비교:강좌가 A강좌 B강좌로 있을 때: A의 끝나는 시간보다, B의 시작시간이 더 크거나, || B의 끝나는 시간보다 A의 시작 시간이 더 크다면 => 안겹친다.
					
			}
		}
	}*/
	LocalDateTime ldt = LocalDateTime.parse(null);
	Date date = new Date();
	public Vector<Lecture> check(Vector<Lecture> lectures){
		
		
		return null;
		
	}


	public static void main(String[] args) {
		

	}
	
	class Lecture{
		private String id;
		private String lectureName;
		private String profName;
		private String credits;
		private String time;
		
		public Lecture(String id, String lectureName, String profName, String credits, String time) {
			super();
			this.id = id;
			this.lectureName = lectureName;
			this.profName = profName;
			this.credits = credits;
			this.time = time;
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLectureName() {
			return lectureName;
		}
		public void setLectureName(String lectureName) {
			this.lectureName = lectureName;
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

}
