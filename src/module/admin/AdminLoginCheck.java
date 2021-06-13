package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Config.AdminInfo;
import main.WindowMainFrame;
import windowsView.admin.WindowAdminLoginPanel;
import windowsView.admin.WindowAdminMenuPanel;

public class AdminLoginCheck implements ActionListener {
	WindowAdminLoginPanel windowAdminLoginPanel;
	JTextField idTxtField; 
	JPasswordField pwField;
	WindowAdminMenuPanel windowAdminMenuPanel;
	JFrame mainFrame;

	public AdminLoginCheck(WindowAdminLoginPanel windowAdminLoginPanel, JTextField idTxtField, JPasswordField pwField,
			WindowAdminMenuPanel windowAdminMenuPanel, JFrame mainFrame) {
		this.idTxtField = idTxtField;
		this.pwField = pwField;
		this.mainFrame = mainFrame;
		this.windowAdminLoginPanel = windowAdminLoginPanel;
		this.windowAdminMenuPanel = windowAdminMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(idTxtField.getText().equals(AdminInfo.ID) || new String(pwField.getPassword()).equals(AdminInfo.PW)){
			JOptionPane.showMessageDialog(null, "관리자 로그인에 성공하셨습니다.");
			windowAdminLoginPanel.setVisible(false);
			windowAdminMenuPanel.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "로그인에 실패하셨습니다.\n 아이디 또는 패스워드를 확인하세요.");
		}

	}

}
