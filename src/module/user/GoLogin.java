package module.user;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import windowsView.WindowInitialPanel;
import windowsView.user.WindowLoginPanel;

public class GoLogin implements ActionListener {
	
	WindowInitialPanel windowInitialPanel;
	WindowLoginPanel windowLoginPanel;
	
	public GoLogin(WindowInitialPanel windowInitialPanel, WindowLoginPanel windowLoginPanel){
		this.windowLoginPanel = windowLoginPanel;
		this.windowInitialPanel = windowInitialPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.windowInitialPanel.setVisible(false);
		this.windowLoginPanel.setVisible(true);
		
	}
}
