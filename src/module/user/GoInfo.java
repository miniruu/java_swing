package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import valueObject.OHwewon;
import windowsView.user.WindowMenuPanel;
import windowsView.user.WindowMyInfoPanel;

public class GoInfo implements ActionListener{
	
	WindowMenuPanel windowMenuPanel;
	OHwewon oHwewon;
	JFrame mainFrame;
	WindowMyInfoPanel windowMyInfoPanel;
	
	public GoInfo(WindowMenuPanel windowMenuPanel, OHwewon oHwewon, JFrame mainFrame, WindowMyInfoPanel windowMyInfoPanel) {
		this.mainFrame = mainFrame;
		this.oHwewon = oHwewon;
		this.windowMyInfoPanel = windowMyInfoPanel;
		this.windowMenuPanel = windowMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		windowMyInfoPanel = new WindowMyInfoPanel(windowMenuPanel, oHwewon.getName(), oHwewon.getId(), oHwewon.getPassword(),oHwewon.getAddress() , oHwewon.getDepartment(), oHwewon.getHwakgwa());
		windowMenuPanel.setVisible(false);
		windowMyInfoPanel.setVisible(true);
		mainFrame.add(windowMyInfoPanel);
	}
}
