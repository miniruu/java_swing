package windowsView.admin;

import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.AdminDelete;
import module.Goback;
import valueObject.OLecture;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class WindowAdminUpdateLecture3 extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField newLecId;
	private JTextField newLecName;
	private JTextField newProfName;
	private JTextField newCredit;
	private JTextField newLecTime;
	
	public WindowAdminUpdateLecture3(WindowAdminMenuPanel windowAdminMenuPanel, WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2, String mainPath, OLecture beforeLecture, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.setBounds(0, 0, 600, 422);
		this.setLayout(null);
		this.setBackground(FVall.adminBgColor);
		this.setSize(FVmainFrame.size);
		this.setVisible(false);
		
		JButton btnNewButton1 = new JButton("← 뒤로가기");
		btnNewButton1.setBounds(76, 41, 117, 29);
		btnNewButton1.addActionListener(new Goback(windowAdminUpdateLecturePanel2, this, windowAdminMenuPanel, windowAdminLoginPanel));
		add(btnNewButton1);
		

		JLabel lblNewLabel = new JLabel("강좌 번호");
		lblNewLabel.setForeground(Color.darkGray);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(61, 193, 61, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("강좌 이름");
		lblNewLabel_1.setForeground(Color.darkGray);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(61, 246, 61, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("교수명");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.darkGray);
		lblNewLabel_2.setBounds(61, 297, 61, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("학점");
		lblNewLabel_3.setForeground(Color.darkGray);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(61, 349, 61, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("시간");
		lblNewLabel_4.setForeground(Color.darkGray);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(61, 400, 61, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("수정 전");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(147, 129, 61, 16);
		add(lblNewLabel_5);
		
		JLabel beforeLecId = new JLabel(beforeLecture.getId());
		beforeLecId.setBounds(132, 193, 145, 16);
		add(beforeLecId);
		
		JLabel beforeLecName = new JLabel(beforeLecture.getLectureName());
		beforeLecName.setBounds(134, 246, 131, 16);
		add(beforeLecName);
		
		JLabel beforeProfName = new JLabel(beforeLecture.getProfName());
		beforeProfName.setBounds(134, 298, 133, 16);
		add(beforeProfName);
		
		JLabel beforeCredit = new JLabel(beforeLecture.getCredits());
		beforeCredit.setBounds(132, 349, 133, 16);
		add(beforeCredit);
		
		JLabel beforeTime = new JLabel(beforeLecture.getTime());
		beforeTime.setBounds(132, 400, 102, 16);
		add(beforeTime);
		
		JLabel lblNewLabel_11 = new JLabel("--------------->");
		lblNewLabel_11.setBounds(316, 194, 161, 16);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("--------------->");
		lblNewLabel_12.setBounds(317, 247, 131, 16);
		add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("--------------->");
		lblNewLabel_13.setBounds(317, 298, 131, 16);
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("--------------->");
		lblNewLabel_14.setBounds(317, 350, 131, 16);
		add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("--------------->");
		lblNewLabel_15.setBounds(317, 401, 131, 16);
		add(lblNewLabel_15);
		
		newLecId = new JTextField(beforeLecture.getId());
		newLecId.setBounds(489, 189, 181, 26);
		add(newLecId);
		newLecId.setColumns(10);
		
		newLecName = new JTextField(beforeLecture.getLectureName());
		newLecName.setBounds(489, 242, 181, 26);
		add(newLecName);
		newLecName.setColumns(10);
		
		newProfName = new JTextField(beforeLecture.getProfName());
		newProfName.setBounds(489, 293, 181, 26);
		add(newProfName);
		newProfName.setColumns(10);
		
		newCredit = new JTextField(beforeLecture.getCredits());
		newCredit.setBounds(489, 345, 181, 26);
		add(newCredit);
		newCredit.setColumns(10);
		
		newLecTime = new JTextField(beforeLecture.getTime());
		newLecTime.setBounds(489, 396, 181, 26);
		add(newLecTime);
		newLecTime.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("수정 후");
		lblNewLabel_16.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_16.setBounds(533, 130, 61, 16);
		add(lblNewLabel_16);
		
		JButton btnNewButton_1 = new JButton("수정하기");
		btnNewButton_1.setBounds(489, 460, 181, 46);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new AdminDelete(newLecId, newLecName, newProfName, newCredit, newLecTime, beforeLecture, mainPath));
		add(btnNewButton_1);
		
		JLabel lblNewLabel_17 = new JLabel("강좌 수정하기");
		lblNewLabel_17.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(316, 28, 117, 46);
		add(lblNewLabel_17);

		
	}
}
