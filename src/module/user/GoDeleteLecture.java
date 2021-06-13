package module.user;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

import constants.Config.FVLectureTable;
import constants.Config.FVall;
import controller.CLecture;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowsView.admin.WindowAdminDeleteLecturePanel1;
import windowsView.user.WindowDeleteLecturePanel;
import windowsView.user.WindowLecturePanel1;
import windowsView.user.WindowMenuPanel;
import windowsView.user.WindowMyLecturePanel;

public class GoDeleteLecture implements ActionListener{
	
	private WindowMenuPanel windowMenuPanel;
	private String separator;
	private OHwewon oHwewon;
	private JFrame mainFrame;
	private WindowDeleteLecturePanel windowDeleteLecturePanel;
	private CLecture cLecture;

	public GoDeleteLecture(WindowMenuPanel windowMenuPanel, String separator, OHwewon oHwewon, JFrame mainFrame, WindowDeleteLecturePanel windowDeleteLecturePanel, CLecture cLecture){
		this.mainFrame = mainFrame;
		this.oHwewon = oHwewon;
		this.separator = separator;
		this.windowDeleteLecturePanel = windowDeleteLecturePanel;
		this.windowMenuPanel = windowMenuPanel;
		this.cLecture = cLecture;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		windowMenuPanel.setVisible(false);
		String[] headings = FVLectureTable.heading;
		String[][] data = new String[10][5];
		Vector<OLecture> bag;
		if (this.separator.substring(0, 1).equals("미")){
			this.windowDeleteLecturePanel =  new WindowDeleteLecturePanel("미리담기", windowMenuPanel, oHwewon, mainFrame);
			bag = cLecture.readAllLecs(oHwewon.getId(), FVall.MiriPath);
		}else{
			this.windowDeleteLecturePanel =  new WindowDeleteLecturePanel("수강신청", windowMenuPanel, oHwewon, mainFrame);
			bag = cLecture.readAllLecs(oHwewon.getId(), FVall.SugangPath);
		}
		mainFrame.add(windowDeleteLecturePanel);
		
		for(int i=0; i<5;i++) {
			data[0][i] = FVLectureTable.heading[i];
		}
		
		for (int i = 0; i < bag.size(); i++){
			data[i + 1][0] = bag.get(i).getId();
			data[i + 1][1] = bag.get(i).getLectureName();
			data[i + 1][2] = bag.get(i).getProfName();
			data[i + 1][3] = bag.get(i).getCredits();
			data[i + 1][4] = bag.get(i).getTime();
		}
		
		JTable bagTable = new JTable(data, headings);
		
		bagTable.setLocation(162, 90);
		bagTable.setSize(500, 200);
		bagTable.setBackground(Color.LIGHT_GRAY);
		bagTable.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, null, null, null));
		bagTable.setRowHeight(20);
		bagTable.setVisible(true);
		this.windowDeleteLecturePanel.add(bagTable);
		
		bagTable.getColumn("강좌번호").setPreferredWidth(15);
		bagTable.getColumn("강좌명").setPreferredWidth(40);
		bagTable.getColumn("교수명").setPreferredWidth(30);
		bagTable.getColumn("학점").setPreferredWidth(5);
		bagTable.getColumn("강좌시간").setPreferredWidth(200);

		this.windowDeleteLecturePanel.setVisible(true);	
	}
}
