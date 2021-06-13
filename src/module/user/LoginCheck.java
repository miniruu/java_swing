package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.CLogin;
import valueObject.OHwewon;
import windowsView.WindowInitialPanel;
import windowsView.user.WindowLoginPanel;
import windowsView.user.WindowMenuPanel;

public class LoginCheck implements ActionListener{
	
	private JTextField idTxtField;
	private JPasswordField pwField;
	private WindowLoginPanel windowLoginPanel;
	private WindowMenuPanel windowMenuPanel;
	private JFrame mainFrame;
	private CLogin cLogin;
	
	public LoginCheck(JTextField idTxtField, JPasswordField pwField, WindowLoginPanel windowLoginPanel, JFrame mainFrame, WindowMenuPanel windowMenuPanel,
			CLogin cLogin){
		this.idTxtField = idTxtField;
		this.pwField = pwField;
		this.windowLoginPanel = windowLoginPanel;
		this.mainFrame = mainFrame;
		this.windowMenuPanel = windowMenuPanel;
		this.cLogin = cLogin;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
	
		String id = idTxtField.getText();
		String pass = new String(pwField.getPassword());
		OHwewon oHwewon = cLogin.show(id, pass);
		if (oHwewon.getId().equals(id) && oHwewon.getPassword().equals(pass)){
			String name = oHwewon.getName();
			JOptionPane.showMessageDialog(null, name + "님 안녕하세요!");
			this.windowLoginPanel.setVisible(false);
			this.windowMenuPanel = new WindowMenuPanel(windowLoginPanel, mainFrame, oHwewon);
			this.mainFrame.add(windowMenuPanel);
			windowMenuPanel.setVisible(true);
		}else{
			JOptionPane.showMessageDialog(null, "로그인에 실패하셨습니다.\n 아이디 또는 패스워드를 확인하세요.");
		}
	}
}
