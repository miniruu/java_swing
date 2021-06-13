package windowsView.admin;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.admin.GoAdminMenu;
import module.admin.GoAdminUpdateLecture3;

public class WindowAdminUpdateLecturePanel2 extends JPanel{
	private static final long serialVersionUID = 1L;
	private WindowAdminUpdateLecture3 windowAdminUpdateLecture3;
	private JTextField lecIdTextField;

	public WindowAdminUpdateLecturePanel2(JTextField pathTextFiled, WindowAdminMenuPanel windowAdminMenuPanel, JFrame mainFrame, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.setBounds(0, 0, 600, 422);
		this.setLayout(null);
		this.setBackground(FVall.adminBgColor);
		this.setSize(FVmainFrame.size);
		this.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("강좌 수정하기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(308, 32, 166, 35);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("← 뒤로가기");
		btnNewButton.setBounds(47, 38, 117, 29);
		btnNewButton.addActionListener(new GoAdminMenu(this, windowAdminMenuPanel));
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("강좌번호 입력:");
		lblNewLabel_1.setBounds(219, 464, 85, 16);
		add(lblNewLabel_1);
		
		lecIdTextField = new JTextField();
		lecIdTextField.setBounds(302, 459, 130, 26);
		add(lecIdTextField);
		lecIdTextField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("입력완료");
		btnNewButton_1.setBounds(433, 459, 117, 29);
		btnNewButton_1.addActionListener(new GoAdminUpdateLecture3(this, pathTextFiled, windowAdminMenuPanel,this.windowAdminUpdateLecture3, lecIdTextField, mainFrame, windowAdminLoginPanel));
		add(btnNewButton_1);
	}
}
