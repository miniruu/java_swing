package windowsView.user;

import javax.swing.JFrame;
import javax.swing.JPanel;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CLecture;
import module.GoMenu;
import module.user.DeleteLecture;
import valueObject.OHwewon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class WindowDeleteLecturePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private CLecture cLecture;
	
	public WindowDeleteLecturePanel(String message, WindowMenuPanel windowMenuPanel, OHwewon oHwewon, JFrame mainFrame) {
		this.setBounds(0, 0, 600, 422);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setLayout(null);
		this.setVisible(false);
		this.cLecture = new CLecture();
		mainFrame.getContentPane().add(this);
		
		JLabel lblNewLabel = new JLabel(message+"에서 강좌 삭제하기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(265, 37, 227, 43);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(303, 468, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("삭제하기");
		btnNewButton.setBounds(429, 468, 117, 29);
		btnNewButton.addActionListener(new DeleteLecture(this, textField, oHwewon, message, cLecture));
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("강좌번호 입력:");
		lblNewLabel_1.setBounds(225, 473, 79, 16);
		add(lblNewLabel_1);
		
		JButton goMenuButton = new JButton("← 뒤로가기");
		goMenuButton.setBounds(45, 47, 117, 29);
		goMenuButton.addActionListener(new GoMenu(this, windowMenuPanel));
		add(goMenuButton);
	}
}
