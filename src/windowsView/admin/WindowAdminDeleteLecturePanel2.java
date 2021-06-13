package windowsView.admin;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.admin.AdminDeleteLecture;
import module.admin.GoAdminMenu;

public class WindowAdminDeleteLecturePanel2 extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public WindowAdminDeleteLecturePanel2(JTextField pathTextFiled, WindowAdminMenuPanel windowAdminMenuPanel) {
		this.setBounds(0, 0, 600, 422);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.adminBgColor);
		this.setLayout(null);
		this.setVisible(false);

		JLabel lectureMiriLabel = new JLabel("강좌 선택");
		lectureMiriLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lectureMiriLabel.setBounds(313, 18, 102, 31);
		this.add(lectureMiriLabel);
		this.setVisible(false);

		JButton GoMenuBtn = new JButton("← 뒤로가기");
		GoMenuBtn.setBounds(43, 23, 127, 31);
		GoMenuBtn.addActionListener(new GoAdminMenu(this, windowAdminMenuPanel));
		this.add(GoMenuBtn);

		JTextField lectureChoiceTxt = new JTextField();
		lectureChoiceTxt.setBounds(301, 398, 177, 26);
		this.add(lectureChoiceTxt);
		lectureChoiceTxt.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("강좌번호 입력:");
		lblNewLabel_7.setBounds(222, 403, 80, 16);
		this.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("(삭제할 강좌 번호 입력)");
		lblNewLabel_8.setBounds(220, 435, 282, 16);
		this.add(lblNewLabel_8);
		
		JButton applyLectureBtn = new JButton("삭제하기");
		applyLectureBtn.addActionListener(new AdminDeleteLecture(lectureChoiceTxt));
		applyLectureBtn.setBounds(490, 398, 117, 29);
		this.add(applyLectureBtn);
		this.setVisible(false);
	}



}
