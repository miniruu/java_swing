package windowsView.user;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Config.FVJoinPanel;
import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CJoin;
import module.GoMain;
import module.user.JoinCheck;
import windowsView.WindowInitialPanel;

public class WindowJoinPanel extends JPanel{

	//attribute
	private static final long serialVersionUID = 1L;
	private WindowInitialPanel windowInitialPanel;
	private CJoin cJoin;

	public WindowJoinPanel(WindowInitialPanel windowInitialPanel) {
		this.setVisible(false);
		this.setLayout(null);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);

		this.windowInitialPanel = windowInitialPanel;
		this.cJoin = new CJoin();
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel.setBounds(348, 119, 85, 42);
		this.add(lblNewLabel);

		JLabel joinIdLebel = new JLabel("아이디");
		joinIdLebel.setBounds(283, 193, 61, 16);
		this.add(joinIdLebel);

		JLabel joinPwLebel = new JLabel("패스워드");
		joinPwLebel.setBounds(283, 221, 61, 16);
		this.add(joinPwLebel);

		JLabel joinNameLabel = new JLabel("이름");
		joinNameLabel.setBounds(283, 249, 61, 16);
		this.add(joinNameLabel);

		JLabel joinAddressLabel = new JLabel("주소");
		joinAddressLabel.setBounds(283, 305, 600, 16);
		this.add(joinAddressLabel);

		JLabel joinMajorLabel = new JLabel("학과");
		joinMajorLabel.setBounds(283, 277, 61, 16);
		this.add(joinMajorLabel);

		JLabel joinDepLabel = new JLabel("부서");
		joinDepLabel.setBounds(283, 333, 61, 16);
		this.add(joinDepLabel);

		JTextField idTextField = new JTextField();
		idTextField.setBounds(337, 188, 148, 26);
		this.add(idTextField);
		idTextField.setColumns(FVJoinPanel.columnSize);

		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(337, 244, 148, 26);
		this.add(nameTextField);
		nameTextField.setColumns(FVJoinPanel.columnSize);

		JTextField addressTextField = new JTextField();
		addressTextField.setBounds(337, 300, 148, 26);
		this.add(addressTextField);
		addressTextField.setColumns(FVJoinPanel.columnSize);

		JTextField depTextField = new JTextField();
		depTextField.setBounds(337, 328, 148, 26);
		this.add(depTextField);
		depTextField.setColumns(FVJoinPanel.columnSize);

		JTextField majorTextField = new JTextField();
		majorTextField.setBounds(337, 272, 148, 26);
		this.add(majorTextField);
		majorTextField.setColumns(FVJoinPanel.columnSize);

		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(337, 216, 150, 26);
		this.add(pwTextField);
		
		JButton submmitBtn = new JButton("SUBMMIT");
		submmitBtn.setBounds(277, 366, 208, 55);
		submmitBtn.addActionListener(new JoinCheck(this, this.windowInitialPanel, idTextField,nameTextField, addressTextField, depTextField,majorTextField, pwTextField, cJoin));
		this.add(submmitBtn);
		
		JButton goMainButton = new JButton("메인화면으로");
		goMainButton.setBounds(21, 17, 130, 42);
		goMainButton.addActionListener(new GoMain(this, this.windowInitialPanel));
		add(goMainButton);
	}


}
