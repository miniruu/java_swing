package module.user;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import constants.Config.FVLectureTable;
import constants.Config.Path;
import controller.CIndex;
import controller.CLecture;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowsView.user.WindowLecturePanel1;
import windowsView.user.WindowLecturePanel2;

public class GoLectureTable implements ActionListener {
	private JTextField pathTextFiled;
	private String[][] data;
	public static Vector<OLecture> bagLectures;
	private WindowLecturePanel2 windowLecturePanel2;
	private WindowLecturePanel1 windowLecturePanel1;
	private CIndex cIndex;
	private CLecture cLecture;
	
	public GoLectureTable(JTextField pathTextFiled, WindowLecturePanel2 windowLecturePanel2, WindowLecturePanel1 windowLecturePanel1, CIndex cIndex, CLecture cLecture) {
		this.pathTextFiled = pathTextFiled ;
		this.data = new String[FVLectureTable.LimitLecture][FVLectureTable.ColLecture];
		bagLectures = new Vector<OLecture>();
		this.windowLecturePanel1 = windowLecturePanel1;
		this.windowLecturePanel2 = windowLecturePanel2;
		this.cLecture = cLecture;
		this.cIndex = cIndex;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){

		String[] headings = FVLectureTable.heading;
		JTable lectureTable = new JTable(data, headings);
		
		String mainPath = Path.campusPath;
		String path_ = this.pathTextFiled.getText();
		String[] path = path_.split("/");
		
		for(int i=0; i<3; i++) {
			mainPath = Path.pPath + cIndex.show(mainPath, path[i]);
		}

		Vector<OLecture> lectures = cLecture.show(mainPath);
		
		for(int i=0; i<5; i++){
			data[0][i] = FVLectureTable.heading[i];
		}
		
		for (int i = 0; i < lectures.size(); i++) {
			bagLectures.add(lectures.get(i));
			data[i + 1][0] = lectures.get(i).getId();
			data[i + 1][1] = lectures.get(i).getLectureName();
			data[i + 1][2] = lectures.get(i).getProfName();
			data[i + 1][3] = lectures.get(i).getCredits();
			data[i + 1][4] = lectures.get(i).getTime();
		}
		
		lectureTable.setSize(500, 200);
		lectureTable.setLocation(162, 90);
		lectureTable.setBackground(Color.LIGHT_GRAY);
		lectureTable.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, null, null, null));
		lectureTable.setRowHeight(20);
		lectureTable.setVisible(true);
		this.windowLecturePanel2.add(lectureTable);
		
		for(int i=0; i<5; i++)
			lectureTable.getColumn(FVLectureTable.heading[i]).setPreferredWidth(FVLectureTable.ColSize[i]);
	
		this.windowLecturePanel1.setVisible(false);
		this.windowLecturePanel2.setVisible(true);
	}
}

