package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windowsView.WindowInitialPanel;
import windowsView.admin.WindowAdminLoginPanel;

public class GoAdminLoginPanel implements ActionListener {
	WindowInitialPanel windowInitialPanel;
	WindowAdminLoginPanel windowAdminLoginPanel;

	public GoAdminLoginPanel(WindowInitialPanel windowInitialPanel, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.windowAdminLoginPanel = windowAdminLoginPanel;
		this.windowInitialPanel = windowInitialPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminLoginPanel.setVisible(true);
		windowInitialPanel.setVisible(false);
	}
}
