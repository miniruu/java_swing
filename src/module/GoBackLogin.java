package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windowsView.WindowInitialPanel;
import windowsView.user.WindowLoginPanel;
import windowsView.user.WindowMenuPanel;

public class GoBackLogin implements ActionListener {
	WindowMenuPanel windowMenuPanel;
	WindowLoginPanel windowLoginPanel;

	public GoBackLogin(WindowMenuPanel windowMenuPanel, WindowLoginPanel windowLoginPanel) {
		this.windowLoginPanel = windowLoginPanel;
		this.windowMenuPanel = windowMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowMenuPanel.setVisible(false);
		windowLoginPanel.setVisible(true);
	}

}
