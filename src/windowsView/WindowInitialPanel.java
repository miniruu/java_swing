package windowsView;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import constants.Config.FVall;
import constants.Config.FVinitialPanel;
import constants.Config.FVmainFrame;
import module.admin.GoAdminLoginPanel;
import module.user.GoJoin;
import module.user.GoLogin;
import windowsView.admin.WindowAdminLoginPanel;
import windowsView.user.WindowJoinPanel;
import windowsView.user.WindowLoginPanel;

public class WindowInitialPanel extends JPanel{
	
	//private 
	private static final long serialVersionUID = 1L;
	
	//association
	private WindowLoginPanel windowLoginPanel;
	private WindowJoinPanel windowJoinPanel;
	private WindowAdminLoginPanel windowAdminLoginPanel;
	
	public WindowInitialPanel(JFrame mainFrame){
		
		super();
		this.setBackground(FVall.bgColor);
		this.setSize(FVmainFrame.size);
		this.setLayout(null);
		this.setVisible(true);
		
		this.windowLoginPanel = new WindowLoginPanel(this, mainFrame);
		this.windowJoinPanel = new WindowJoinPanel(this);
		this.windowAdminLoginPanel = new WindowAdminLoginPanel(this, mainFrame);
		
		mainFrame.getContentPane().add(windowLoginPanel);
		mainFrame.getContentPane().add(windowJoinPanel);
		mainFrame.getContentPane().add(windowAdminLoginPanel);

		JLabel lblNewLabel = new JLabel(FVinitialPanel.mainText);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(280, 62, 281, 63);
		add(lblNewLabel);
		
		JButton loginButton = new JButton(FVinitialPanel.loginButtonText);
		loginButton.setBounds(318, 187, 189, 86);
		loginButton.addActionListener(new GoLogin(this,windowLoginPanel));
		add(loginButton);
		
		JButton JoinButton = new JButton(FVinitialPanel.joinButtonText);
		JoinButton.setBounds(318, 316, 189, 86);
		JoinButton.addActionListener(new GoJoin(this,windowJoinPanel));
		add(JoinButton);
		
		JButton btnNewButton = new JButton(FVinitialPanel.adminButtonText);
		btnNewButton.setBounds(318, 443, 189, 86);
		btnNewButton.addActionListener(new GoAdminLoginPanel(this, windowAdminLoginPanel));
		add(btnNewButton);
	}
}
