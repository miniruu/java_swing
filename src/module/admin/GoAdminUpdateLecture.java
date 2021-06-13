package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windowsView.admin.WindowAdminLoginPanel;
import windowsView.admin.WindowAdminMenuPanel;
import windowsView.admin.WindowUpdateLecturePanel1;

public class GoAdminUpdateLecture implements ActionListener {
	private WindowAdminMenuPanel windowAdminMenuPanel;
	private WindowUpdateLecturePanel1 windowUpdateLecturePanel1;

	public GoAdminUpdateLecture(WindowAdminMenuPanel windowAdminMenuPanel, WindowUpdateLecturePanel1 windowUpdateLecturePanel1, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.windowAdminMenuPanel = windowAdminMenuPanel;
		this.windowUpdateLecturePanel1 = windowUpdateLecturePanel1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminMenuPanel.setVisible(false);
		windowUpdateLecturePanel1.setVisible(true);

	}
}
