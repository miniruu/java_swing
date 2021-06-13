package windowsView.admin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Config.FVLoginPanel;
import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.GoMain;
import module.admin.AdminLoginCheck;
import windowsView.WindowInitialPanel;

import java.awt.Font;

public class WindowAdminLoginPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private WindowInitialPanel windowInitialPanel;
	private WindowAdminMenuPanel windowAdminMenuPanel;
	
	public WindowAdminLoginPanel(WindowInitialPanel windowInitialPanel, JFrame mainFrame) {
		
		this.setLayout(null);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.adminBgColor);
		this.setVisible(false);
		this.windowInitialPanel = windowInitialPanel;
		this.windowAdminMenuPanel = new WindowAdminMenuPanel(this, mainFrame, windowInitialPanel);
		
		mainFrame.add(windowAdminMenuPanel);
		
		JLabel idLabel = new JLabel(FVLoginPanel.IdLabel);
		idLabel.setBounds(260, 192, 61, 21);
		this.add(idLabel);
		
		JLabel pwLabel = new JLabel(FVLoginPanel.PwLabel);
		pwLabel.setBounds(260, 225, 61, 21);
		this.add(pwLabel);
		
		JTextField idTxtField = new JTextField();
		idTxtField.setBounds(333, 186, 194, 32);
		this.add(idTxtField);
		idTxtField.setColumns(FVLoginPanel.columnSize);
		
		JPasswordField pwField = new JPasswordField();
		pwField.setBounds(333, 219, 194, 32);
		this.add(pwField);
		
		JButton loginCheckBtn = new JButton(FVLoginPanel.loginButtonLabel);
		loginCheckBtn.setBounds(256, 271, 271, 46);
		loginCheckBtn.addActionListener(new AdminLoginCheck(this, idTxtField, pwField, windowAdminMenuPanel, mainFrame));
		this.add(loginCheckBtn);
		
		JButton goMainButton = new JButton(FVLoginPanel.goMainButtoText);
		goMainButton.setBounds(32, 26, 140, 46);
		goMainButton.addActionListener(new GoMain(this, this.windowInitialPanel));
		add(goMainButton);
		
		JLabel lblNewLabel = new JLabel("관리자 로그인입니다.");
		lblNewLabel.setFont(new Font(FVall.FONT, Font.PLAIN, 18));
		lblNewLabel.setBounds(333, 23, 173, 46);
		add(lblNewLabel);
		
		
	}
}
