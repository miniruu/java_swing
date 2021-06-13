package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import main.WindowMainFrame;
import windowsView.user.WindowLecturePanel1;
import windowsView.user.WindowMenuPanel;

public class GoMenu implements ActionListener{
	
	private JPanel jPanel;
	private WindowMenuPanel windowMenuPanel;

	public GoMenu(JPanel jPanel, WindowMenuPanel windowMenuPanel){
		this.jPanel = jPanel;
		this.windowMenuPanel = windowMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		jPanel.setVisible(false);
		windowMenuPanel.setVisible(true);
	}
}
