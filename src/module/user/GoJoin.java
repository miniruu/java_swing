package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import windowsView.user.WindowJoinPanel;

public class GoJoin implements ActionListener {

	//attribute
	JPanel mainPanel;
	WindowJoinPanel windowJoinPanel;
	
	public GoJoin(JPanel mainPanel, WindowJoinPanel windowJoinPanel){
		this.windowJoinPanel = windowJoinPanel;
		this.mainPanel = mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.mainPanel.setVisible(false);
		this.windowJoinPanel.setVisible(true);
		
	}
}
