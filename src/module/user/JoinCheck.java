package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.CJoin;
import windowsView.WindowInitialPanel;
import windowsView.user.WindowJoinPanel;


public class JoinCheck implements ActionListener {
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField addressTextField;
	private JTextField depTextField;
	private JTextField majorTextField;
	private JPasswordField pwTextField;
	private WindowJoinPanel windowJoinPanel;
	private WindowInitialPanel windowInitialPanel;
	private CJoin cJoin;
	
	public JoinCheck(WindowJoinPanel windowJoinPanel, WindowInitialPanel windowInitialPanel, JTextField idTextField, JTextField nameTextField, JTextField addressTextField,
			JTextField depTextField, JTextField majorTextField, JPasswordField pwTextField, CJoin cJoin) {
		this.idTextField = idTextField;
		this.nameTextField = nameTextField;
		this.addressTextField = addressTextField;
		this.depTextField = depTextField;
		this.majorTextField = majorTextField;
		this.pwTextField = pwTextField;
		this.windowInitialPanel = windowInitialPanel;
		this.windowJoinPanel = windowJoinPanel;
		this.cJoin = cJoin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = idTextField.getText();
		String pass = new String(pwTextField.getPassword());
		String name = nameTextField.getText();
		String address = addressTextField.getText();
		String department = depTextField.getText();
		String major = majorTextField.getText();

		if (cJoin.show(id, pass, department, name, address, major)) {
			JOptionPane.showMessageDialog(null, "회원가입에 성공하셨습니다.\n 가입된 아이디로 로그인 해주세요.");
			windowInitialPanel.setVisible(true);
			windowJoinPanel.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "회원가입에 실패했습니다. 다시 회원가입을 해주세요.");
		}

	}

}
