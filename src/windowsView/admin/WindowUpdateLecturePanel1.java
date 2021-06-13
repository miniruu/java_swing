package windowsView.admin;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVLecturePanelSeoul;
import constants.Config.FVLecturePanelYongin;
import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CIndex;
import controller.CLecture;
import module.SCombo;
import module.YCombo;
import module.admin.GoAdminMenu;
import module.admin.GoAdminUpdateLecture2;

public class WindowUpdateLecturePanel1 extends JPanel{
	private static final long serialVersionUID = 1L;
	private WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2;
	private CLecture cLecture;
	private CIndex  cIndex;
	
	public WindowUpdateLecturePanel1(WindowAdminMenuPanel windowAdminMenuPanel, JFrame mainFrame, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.setBounds(0, 0, 600, 422);
		this.setLayout(null);
		this.setBackground(FVall.adminBgColor);
		this.setSize(FVmainFrame.size);
		this.setVisible(false);
		this.cIndex = new CIndex();
		this.cLecture = new CLecture();
		
		JButton goMenuBtn = new JButton("← 뒤로가기");
		goMenuBtn.setBounds(38, 30, 117, 29);
		goMenuBtn.addActionListener(new GoAdminMenu(this, windowAdminMenuPanel));
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
		
		this.windowAdminUpdateLecturePanel2 = new WindowAdminUpdateLecturePanel2(pathTextFiled, windowAdminMenuPanel, mainFrame, windowAdminLoginPanel);
		mainFrame.add(windowAdminUpdateLecturePanel2);
		
		JLabel hakgwaLabel = new JLabel("3.학과 보기");
		hakgwaLabel.setBounds(124, 244, 71, 16);
		this.add(hakgwaLabel);
		
		//용인 콤보박스
		JComboBox yColleges = new JComboBox();
		yColleges.setModel(new DefaultComboBoxModel(FVLecturePanelYongin.gyoyang));
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
		checkBtn.addActionListener(new GoAdminUpdateLecture2(this, windowAdminUpdateLecturePanel2, pathTextFiled, cIndex, cLecture));
		this.add(checkBtn);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(112, 277, 170, 20);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("2.대학 보기");
		lblNewLabel_3.setBounds(124, 183, 61, 16);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("추가할 강의가 속한 캠퍼스/대학/학과 순으로  입력해주세요.");
		lblNewLabel_4.setBounds(244, 309, 320, 16);
		this.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("(예시:서울/ict융합대학/융합소프트웨어학과에 강의를 추가할 경우: 2/21/212 <-이렇게 입력)");
		lblNewLabel_5.setBounds(243, 337, 501, 16);
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
