package constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public final class Config {
	public static class FVmainFrame{
		public static final Point location = new Point(200, 300);
		public static final Dimension size = new Dimension(800,800*9/12);
	}
	
	public static class FVall{
		public static final String Line = "───────────────────────────────────────────────────────────";
		public static final String SugangPath = "src/data/stdLecs/";
		public static final String MiriPath = "src/data/stdBag/";
		public static final Color bgColor = new Color(210, 253, 230);
		public static final Color adminBgColor = new Color(200, 225, 252);
		public static final int MAXCREDIT = 18;
		public static final String FONT = "Lucida Grande";
	}
	
	public static class FVmainPanel{
		public static final Color backGroungcolor = Color.BLUE;
	}
	
	public static class FVinitialPanel{
		public static final String mainText = "◐ 명지대학교 수강신청 프로그램 ◑";
		public static final String loginButtonText = "LOGIN";
		public static final String joinButtonText = "JOIN";
		public static final String adminButtonText = "관리자";
	}
	
	public static class FVLoginPanel{
		public static final int columnSize = 10;
		public static final String loginButtonLabel = "LOGIN";
		public static final String IdLabel = "      ID";
		public static final String PwLabel = "Password";
		public static final String goMainButtoText = "메인화면으로";
		
	}
	public static class FVLectureTable{
		public static final String[] heading = { "강좌번호", "강좌명", "교수명", "학점", "강좌시간" };
		public static final int[] ColSize = {15, 40, 30, 5, 200};
		public static final int ColLecture = 5;
		public static final int LimitLecture = 10;
	}
	
	public static class AdminInfo{
		public static final String ID = "admin";
		public static final String PW = "123123";
	}
	
	public static class Path{
		public static final String pPath = "src/data/";
		public static final String campusPath = "src/data/campus/";
		public static final String stdsPath =  "src/data/std/stdAll";
		public static final String sugang = "stdLecs";
		public static final String miri = "stdBag";
		
	}
	
	public static class FVJoinPanel{
		public static final int columnSize = 10;
	}
	
	public static class FVLecturePanel1Label{
		public static final String info1 = "선택한 강의 번호들을 캠퍼스번호/대학번호/학과번호 순으로 입력해주세요.";
		public static final String info2 = "(예시:서울/ict융합대학/융합소프트웨어를 선택한 경우: 2/21/212 <-이렇게 입력)";
	}
	
	public static class FVLecturePanelYongin{
		public static final String[] YCollege = { "10:교양", "11:공과대학", "12:자연과학대학", "13:예술체육대학", "14:건축대학" };
		public static final String[] gongGwa = { "111:전기공학과", "112:컴퓨터공학과" };
		public static final String[] gyoyang = { "101:영어교양", "102:기초교양", "103:선택교양" };
		public static final String[] jayeun = { "120:수학과", "121:물리학과", "122:화학과", "123:식품영양학과", "124:생명과학정보학과" };
		public static final String[] art = { "130:디자인학부", "131:체육학부", "132:음악학부", "133:바둑학과", "134:영화/뮤지컬" };
		public static final String[] gunchuk = { "140:건축학부", "141:공간디자인"};
	}
	
	public static class FVLecturePanelSeoul{
		public static final String[] SCollege = { "20:교양", "21:ICT융합대학", "22:경영대학", "23:사회과학대학", "24:인문대학", "25:법학대학" };
		public static final String[] gyoyang = { "201:영어교양", "202:기초교양", "203:선택교양" };
		public static final String[] ict = { "211:디지털컨텐츠", "212:융합소프트웨어" };
		public static final String[] gyung0 = { "220:경영학과", "221:국제통상학과", "222:경영정보학과", "223:부동산학과", "224:경영교육혁신센터" };
		public static final String[] inmun = { "240:국어국문학과", "241:중어중문학과", "242일어일문학과", "243:영어영문학과" };
		public static final String[] socialSience = { "230:행정학과", "231:경제학과", "232:정치외교학과", "233:디지털미디어학과", "234:아동학과", "235:청소년지도학과", "236:사회복지학과" };
		public static final String[] law = { "250:법학과", "251:법무정책학과" };
	}
	
}
