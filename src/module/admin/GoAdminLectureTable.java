package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windowsView.admin.WindowAdminCreateLecturePanel1;
import windowsView.admin.WindowAdminMenuPanel;

public class GoAdminLectureTable implements ActionListener {

	WindowAdminMenuPanel windowAdminMenuPanel;
	WindowAdminCreateLecturePanel1 windowAdminCreateLecturePanel1;
	
	public GoAdminLectureTable(WindowAdminMenuPanel windowAdminMenuPanel, WindowAdminCreateLecturePanel1 windowAdminCreateLecturePanel1) {
		this.windowAdminCreateLecturePanel1 = windowAdminCreateLecturePanel1;
		this.windowAdminMenuPanel = windowAdminMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminCreateLecturePanel1.setVisible(true);
		windowAdminMenuPanel.setVisible(false);
	}

}
