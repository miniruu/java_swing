package windowsView.user;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Config.FVLoginPanel;
import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CLogin;
import module.GoMain;
import module.user.LoginCheck;
import valueObject.OHwewon;
import windowsView.WindowInitialPanel;

public class WindowLoginPanel extends JPanel{
	
	//attribute
	private static final long serialVersionUID = 1L;
	private JTextField idTxtField;
	private JPasswordField pwField;
	
	//component
	private JFrame mainFrame;
	
	//association 
	private WindowMenuPanel windowMenuPanel;
	private WindowInitialPanel windowInitialPanel;
	private CLogin cLogin;
	
	public WindowLoginPanel(WindowInitialPanel windowInitialPanel, JFrame mainFrame){
		
		this.setLayout(null);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setVisible(false);
		
		this.mainFrame = mainFrame;
		this.windowInitialPanel = windowInitialPanel;
		this.windowMenuPanel = new WindowMenuPanel(this, mainFrame, new OHwewon());
		this.cLogin = new CLogin();
		
		JLabel idLabel = new JLabel(FVLoginPanel.IdLabel);
		idLabel.setBounds(260, 192, 61, 21);
		this.add(idLabel);
		
		JLabel pwLabel = new JLabel(FVLoginPanel.PwLabel);
		pwLabel.setBounds(260, 225, 61, 21);
		this.add(pwLabel);
		
		idTxtField = new JTextField();
		idTxtField.setBounds(333, 186, 194, 32);
		this.add(idTxtField);
		idTxtField.setColumns(FVLoginPanel.columnSize);
		
		pwField = new JPasswordField();
		pwField.setBounds(333, 219, 194, 32);
		this.add(pwField);
		
		JButton loginCheckBtn = new JButton(FVLoginPanel.loginButtonLabel);
		loginCheckBtn.setBounds(256, 271, 271, 46);
		loginCheckBtn.addActionListener(new LoginCheck(idTxtField, pwField, this, this.mainFrame, windowMenuPanel, cLogin));
		this.add(loginCheckBtn);
		
		JButton goMainButton = new JButton(FVLoginPanel.goMainButtoText);
		goMainButton.setBounds(32, 26, 140, 46);
		goMainButton.addActionListener(new GoMain(this, windowInitialPanel));
		add(goMainButton);
	}
	
}
