package windowsView.user;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import constants.Config.FVLecturePanel1Label;
import constants.Config.FVLecturePanelSeoul;
import constants.Config.FVLecturePanelYongin;
import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CIndex;
import controller.CLecture;
import module.GoMenu;
import module.SCombo;
import module.YCombo;
import module.user.GoLectureTable;
import module.YCombo;
import valueObject.OHwewon;
import valueObject.OLecture;

public class WindowLecturePanel1 extends JPanel{

	//private
	private static final long serialVersionUID = 1L;
	private WindowLecturePanel2 windowLecturePanel2;
	private CLecture cLecture;
	private CIndex cIndex;
	
	public WindowLecturePanel1(String message, WindowMenuPanel windowMenuPanel, OHwewon oHwewon, JFrame mainFrame){
		
		this.cLecture = new CLecture();
		this.cIndex = new CIndex();
		
		this.setBounds(0, 0, 600, 422);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setLayout(null);
		this.setVisible(false);
		
		JLabel miriLabel = new JLabel(oHwewon.getName()+"님의 "+ message);
		miriLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		miriLabel.setBounds(199, 24, 311, 31);
		this.add(miriLabel);
		
		JButton goMenuBtn = new JButton("← 뒤로가기");
		goMenuBtn.setBounds(38, 30, 117, 29);
		goMenuBtn.addActionListener(new GoMenu(this, windowMenuPanel));
		this.add(goMenuBtn);
		
		JLabel campusLabel = new JLabel("1.용인/서울 중 선택");
		campusLabel.setBounds(124, 124, 170, 23);
		this.add(campusLabel);
		
		JLabel collegLabel = new JLabel("4.최종입력");
		collegLabel.setBounds(124, 309, 61, 16);
		this.add(collegLabel);
		
		JTextField pathTextFiled = new JTextField();
		pathTextFiled.setBounds(289, 370, 209, 26);
		this.add(pathTextFiled);
		pathTextFiled.setColumns(10);
		
		
		JLabel hakgwaLabel = new JLabel("3.학과 보기");
		hakgwaLabel.setBounds(124, 244, 71, 16);
		this.add(hakgwaLabel);
		
		//용인 콤보박스
		JComboBox yColleges = new JComboBox();
		yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.gyoyang));
		yColleges.setBounds(243, 240, 170, 27);
		this.add(yColleges);
		
		JComboBox yonginComboBox = new JComboBox();
		yonginComboBox.setModel(new DefaultComboBoxModel(FVLecturePanelYongin.YCollege));
		yonginComboBox.setBounds(243, 179, 170, 27);
		yonginComboBox.addActionListener(new YCombo(yColleges, yonginComboBox));
		this.add(yonginComboBox);
		
		//서울 콤보박스
		JComboBox sCollege = new JComboBox();
		sCollege.setModel(new DefaultComboBoxModel(FVLecturePanelSeoul.gyoyang));
		sCollege.setBounds(449, 240, 169, 27);
		this.add(sCollege);
		
		JComboBox seoulComboBox = new JComboBox();
		seoulComboBox.setModel(new DefaultComboBoxModel(FVLecturePanelSeoul.SCollege));
		seoulComboBox.setBounds(448, 179, 170, 27);
		seoulComboBox.addActionListener(new SCombo(sCollege, seoulComboBox));
		this.add(seoulComboBox);
		
		/*입력 후 강의 목록 보기*/
		JButton checkBtn = new JButton("입력완료");
		checkBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		checkBtn.setBounds(243, 408, 255, 57);
		this.windowLecturePanel2 = new WindowLecturePanel2(windowMenuPanel, message, oHwewon, mainFrame);
		checkBtn.addActionListener(new GoLectureTable(pathTextFiled, windowLecturePanel2, this, cIndex, cLecture));
		this.add(checkBtn);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(112, 277, 170, 20);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("2.대학 보기");
		lblNewLabel_3.setBounds(124, 183, 61, 16);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(FVLecturePanel1Label.info1);
		lblNewLabel_4.setBounds(244, 309, 401, 16);
		this.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel(FVLecturePanel1Label.info2);
		lblNewLabel_5.setBounds(243, 337, 441, 16);
		this.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("입력:");
		lblNewLabel_6.setBounds(243, 375, 34, 16);
		this.add(lblNewLabel_6);

		JLabel lblNewLabel_9 = new JLabel("1:용인");
		lblNewLabel_9.setBounds(248, 127, 61, 16);
		this.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("2:서울");
		lblNewLabel_10.setBounds(464, 127, 61, 16);
		this.add(lblNewLabel_10);

	}
}
