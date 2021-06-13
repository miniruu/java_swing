package windowsView.admin;

import javax.swing.JPanel;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CIndex;
import controller.CLecture;
import module.admin.CreateLecture;
import module.admin.GoAdminMenu;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WindowAdminCreateLecturePanel2 extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField lecutreId;
	private JTextField profName;
	private JTextField lectureName;
	private JTextField credits;
	private JTextField time;
	private CLecture cLecture;
	private CIndex cIndex;

	public WindowAdminCreateLecturePanel2(JTextField pathTextFiled, WindowAdminMenuPanel windowAdminMenuPanel) {
		this.setLayout(null);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.adminBgColor);
		this.setVisible(false);
		this.cIndex = new CIndex();
		this.cLecture = new CLecture();
		
		JLabel lblNewLabel = new JLabel("강좌 추가하기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setBounds(319, 42, 112, 49);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("강좌번호");
		lblNewLabel_1.setBounds(250, 163, 61, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("담당교수");
		lblNewLabel_2.setBounds(250, 218, 61, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("강좌명");
		lblNewLabel_3.setBounds(250, 267, 61, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("학점");
		lblNewLabel_4.setBounds(250, 315, 61, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("시간");
		lblNewLabel_5.setBounds(250, 365, 61, 16);
		add(lblNewLabel_5);
		
		lecutreId = new JTextField();
		lecutreId.setBounds(319, 158, 165, 26);
		add(lecutreId);
		lecutreId.setColumns(10);
		
		profName = new JTextField();
		profName.setBounds(319, 213, 165, 26);
		add(profName);
		profName.setColumns(10);
		
		lectureName = new JTextField();
		lectureName.setBounds(319, 262, 165, 26);
		add(lectureName);
		lectureName.setColumns(10);
		
		credits = new JTextField();
		credits.setBounds(319, 310, 165, 26);
		add(credits);
		credits.setColumns(10);
		
		time = new JTextField();
		time.setBounds(319, 360, 161, 26);
		add(time);
		time.setColumns(10);
		
		JButton btnNewButton = new JButton("추가하기");
		btnNewButton.setBounds(290, 419, 141, 49);
		btnNewButton.addActionListener(new CreateLecture(lecutreId, profName, lectureName, credits, time, pathTextFiled, cIndex, cLecture));
		add(btnNewButton);
		
		JButton goMenuButton = new JButton("메뉴로 가기");
		goMenuButton.setBounds(40, 56, 117, 29);
		goMenuButton.addActionListener(new GoAdminMenu(this, windowAdminMenuPanel));
		add(goMenuButton);
		this.setVisible(false);
	}
}
