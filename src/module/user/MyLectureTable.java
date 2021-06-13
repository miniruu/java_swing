package module.user;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import constants.Config.FVLectureTable;
import constants.Config.FVall;
import constants.others.SameTimeLectureArrayList;
import controller.CLecture;
import module.FindSameTime;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowsView.user.WindowMenuPanel;
import windowsView.user.WindowMyLecturePanel;

public class MyLectureTable implements ActionListener {

	private WindowMenuPanel windowMenuPanel;
	private OHwewon oHwewon;
	private WindowMyLecturePanel windowMyLecturePanel;
	private String separator;
	private JFrame mainFrame;
	private CLecture cLecture;

	public MyLectureTable(WindowMenuPanel windowMenuPanel, OHwewon oHwewon, String separator, JFrame mainFrame, WindowMyLecturePanel windowMyLecturePanel, CLecture cLecture) {
		this.windowMenuPanel = windowMenuPanel;
		this.oHwewon = oHwewon;
		this.separator = separator;
		this.windowMyLecturePanel = windowMyLecturePanel;
		this.mainFrame = mainFrame;
		this.cLecture = cLecture;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		this.windowMenuPanel.setVisible(false);
		// stdLecs
		String[] headings = FVLectureTable.heading;
		String[][] data = new String[10][5];
//		Vector<OLecture> allLecs = new Vector<OLecture>();
		Vector<OLecture> bag;
		
		if (this.separator.equals("bag")){
			this.windowMyLecturePanel =  new WindowMyLecturePanel("미리담기 내역", windowMenuPanel, oHwewon, mainFrame);

			bag = cLecture.readAllLecs(oHwewon.getId(), FVall.MiriPath);
			
			JLabel lblNewLabel = new JLabel("미리담기");
			lblNewLabel.setBounds(48, 498, 73, 26);
			this.windowMyLecturePanel.add(lblNewLabel);
			
			JLabel lblNewLabel_2 = new JLabel("수강신청");
			lblNewLabel_2.setBounds(169, 503, 88, 16);
			this.windowMyLecturePanel.add(lblNewLabel_2);
			
		} else{
			this.windowMyLecturePanel =  new WindowMyLecturePanel("수강신청 내역", windowMenuPanel, oHwewon, mainFrame);
			
			bag = cLecture.readAllLecs(oHwewon.getId(), FVall.SugangPath);
			
			JLabel lblNewLabel = new JLabel("수강신청");
			lblNewLabel.setBounds(48, 498, 73, 26);
			this.windowMyLecturePanel.add(lblNewLabel);
			
			JLabel lblNewLabel_2 = new JLabel("미리담기");
			lblNewLabel_2.setBounds(169, 503, 88, 16);
			this.windowMyLecturePanel.add(lblNewLabel_2);
		}
		
		/*SameTimeLectureArrayList*/
		SameTimeLectureArrayList sameTimeLectureArrayList = new SameTimeLectureArrayList();
		sameTimeLectureArrayList = FindSameTime.find(bag);

		String message = "";
		if(sameTimeLectureArrayList.arr.size() >=1){
			for(int i=0; i<sameTimeLectureArrayList.arr.size();i++){
				message += sameTimeLectureArrayList.arr.get(i).one.getLectureName()+" - ";
				message += sameTimeLectureArrayList.arr.get(i).two.getLectureName() +" //";
			}
		}
		/*-------------------------*/
		
		for(int i=0; i<5;i++) {
			data[0][i] = FVLectureTable.heading[i];
		}
		
		int sum = 0;
		for (int i = 0; i < bag.size(); i++){
			data[i + 1][0] = bag.get(i).getId();
			data[i + 1][1] = bag.get(i).getLectureName();
			data[i + 1][2] = bag.get(i).getProfName();
			data[i + 1][3] = bag.get(i).getCredits();
			data[i + 1][4] = bag.get(i).getTime();
			sum += Integer.parseInt(bag.get(i).getCredits());
		}
		
		JTable bagTable = new JTable(data, headings);
		
		bagTable.setLocation(162, 90);
		bagTable.setSize(500, 200);
		bagTable.setBackground(Color.LIGHT_GRAY);
		bagTable.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, null, null, null));
		bagTable.setRowHeight(20);
		bagTable.setVisible(true);
		this.windowMyLecturePanel.add(bagTable);

		//lblNewLabel_4.setForeground(Color.WHITE);
		if(sameTimeLectureArrayList.arr.size() >=1){
			JLabel lblNewLabel_2 = new JLabel(" ! 시간 중복 강좌");
			lblNewLabel_2.setBounds(66, 341, 117, 16);
			lblNewLabel_2.setForeground(Color.RED);
			this.windowMyLecturePanel.add(lblNewLabel_2);
			
			JLabel duplicatedLectureInfoLabel = new JLabel(message);
			duplicatedLectureInfoLabel.setVerticalAlignment(SwingConstants.TOP);
			duplicatedLectureInfoLabel.setBounds(66, 369, 645, 84);
			duplicatedLectureInfoLabel.setBackground(FVall.bgColor);
			this.windowMyLecturePanel.add(duplicatedLectureInfoLabel);			
			
			JLabel lblNewLabel = new JLabel("위의 강좌들이 중복됩니다.");
			lblNewLabel.setBounds(66, 400, 217, 26);
			lblNewLabel.setForeground(Color.RED);
			this.windowMyLecturePanel.add(lblNewLabel);
		}
		

		for(int i=0; i<5; i++) {
			bagTable.getColumn(FVLectureTable.heading[i]).setPreferredWidth(FVLectureTable.ColSize[i]);
			
		}
		
		JLabel sumCredit = new JLabel("총 "+sum+"학점");
		sumCredit.setBounds(585, 74, 89, 16);
		this.windowMyLecturePanel.add(sumCredit);

		this.windowMyLecturePanel.setVisible(true);
	}
}
