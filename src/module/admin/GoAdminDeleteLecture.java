package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import windowsView.admin.WindowAdminDeleteLecturePanel1;
import windowsView.admin.WindowAdminDeleteLecturePanel2;
import windowsView.admin.WindowAdminMenuPanel;

public class GoAdminDeleteLecture implements ActionListener {
	WindowAdminDeleteLecturePanel1 windowAdminDeleteLecturePanel1;
	WindowAdminMenuPanel windowAdminMenuPanel;


	public GoAdminDeleteLecture(WindowAdminMenuPanel windowAdminMenuPanel, WindowAdminDeleteLecturePanel1 windowAdminDeleteLecturePanel1) {
		this.windowAdminDeleteLecturePanel1  = windowAdminDeleteLecturePanel1;
		this.windowAdminMenuPanel= windowAdminMenuPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminDeleteLecturePanel1.setVisible(true);
		windowAdminMenuPanel.setVisible(false);

	}
}
