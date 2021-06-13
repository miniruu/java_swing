package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import windowsView.WindowInitialPanel;
import windowsView.user.WindowJoinPanel;
import windowsView.user.WindowLoginPanel;

public class GoMain implements ActionListener {
	
	JPanel loginOrjoinPanel;
	
	WindowJoinPanel windowJoinPanel;
	WindowLoginPanel windowLoginPanel;
	WindowInitialPanel windowInitialPanel;
	public GoMain(JPanel loginOrJoinPanel, WindowInitialPanel windowInitialPanel) {
		this.loginOrjoinPanel = loginOrJoinPanel;
		this.windowInitialPanel = windowInitialPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		this.loginOrjoinPanel.setVisible(false);
		this.windowInitialPanel.setVisible(true);
	}
}
