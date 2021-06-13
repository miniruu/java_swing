package windowsView.user;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.GoMenu;
import java.awt.Color;

public class WindowMyInfoPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public WindowMyInfoPanel(WindowMenuPanel windowMenuPanel, String name, String id, String pw, String hakgwa, String dept, String address){
		
		this.setVisible(false);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(name+"님의 정보");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(287, 18, 282, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setForeground(Color.darkGray);
		
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(239, 124, 61, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setForeground(Color.darkGray);
	
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(239, 171, 61, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("패스워드");
		lblNewLabel_3.setForeground(Color.darkGray);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(239, 218, 61, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("학과");
		lblNewLabel_4.setForeground(Color.darkGray);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(239, 266, 61, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("부서");
		lblNewLabel_5.setForeground(Color.darkGray);
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(239, 314, 61, 16);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("주소");
		lblNewLabel_6.setForeground(Color.darkGray);
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(239, 358, 61, 16);
		add(lblNewLabel_6);
		
		JLabel myName = new JLabel(name);
		myName.setBounds(365, 125, 118, 16);
		add(myName);
		
		JLabel myId = new JLabel(id);
		myId.setBounds(365, 172, 100, 16);
		add(myId);
		
		JLabel myPw = new JLabel(pw);
		myPw.setBounds(365, 219, 100, 16);
		add(myPw);
		
		JLabel myHakgwa = new JLabel(hakgwa);
		myHakgwa.setBounds(365, 267, 100, 16);
		add(myHakgwa);
		
		JLabel myDept = new JLabel(dept);
		myDept.setBounds(365, 315, 118, 16);
		add(myDept);
		
		JLabel myAddress = new JLabel(address);
		myAddress.setBounds(365, 359, 118, 16);
		add(myAddress);
	
		JButton goMenuButton = new JButton("메인화면으로");
		goMenuButton.setBounds(32, 35, 117, 29);
		goMenuButton.addActionListener(new GoMenu(this, windowMenuPanel));
		add(goMenuButton);
	}
}
