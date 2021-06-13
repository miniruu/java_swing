package module.admin;

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
import valueObject.OLecture;
import windowsView.admin.WindowAdminUpdateLecturePanel2;
import windowsView.admin.WindowUpdateLecturePanel1;

public class GoAdminUpdateLecture2 implements ActionListener {
	private WindowUpdateLecturePanel1 windowUpdateLecturePanel1;
	private WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2;
	private JTextField pathTextFiled;
	private CIndex cIndex;
	private CLecture cLecture;
	private String[][] data;
	public static Vector<OLecture> bagLectures;
	public static String mainPath; 

	public GoAdminUpdateLecture2(WindowUpdateLecturePanel1 windowUpdateLecturePanel1, WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2, JTextField pathTextFiled, CIndex cIndex,
			CLecture cLecture) {
		this.cIndex = cIndex;
		this.cLecture = cLecture;
		this.pathTextFiled = pathTextFiled;
		this.windowAdminUpdateLecturePanel2 = windowAdminUpdateLecturePanel2;
		this.windowUpdateLecturePanel1 = windowUpdateLecturePanel1;
		this.data = new String[FVLectureTable.LimitLecture][FVLectureTable.ColLecture];
		bagLectures = new Vector<OLecture>();
		mainPath = "";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowUpdateLecturePanel1.setVisible(false);
		windowAdminUpdateLecturePanel2.setVisible(true);
		String[] headings = FVLectureTable.heading;
		JTable lectureTable = new JTable(data, headings);
		
		mainPath = Path.campusPath;
		String path_ = pathTextFiled.getText();
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
		this.windowAdminUpdateLecturePanel2.add(lectureTable);
		
		for(int i=0; i<5; i++)
			lectureTable.getColumn(FVLectureTable.heading[i]).setPreferredWidth(FVLectureTable.ColSize[i]);
	
		this.windowAdminUpdateLecturePanel2.setVisible(false);
		this.windowAdminUpdateLecturePanel2.setVisible(true);
	}
}
