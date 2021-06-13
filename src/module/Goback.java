package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import windowsView.admin.WindowAdminLoginPanel;
import windowsView.admin.WindowAdminMenuPanel;
import windowsView.admin.WindowAdminUpdateLecture3;
import windowsView.admin.WindowAdminUpdateLecturePanel2;

public class Goback implements ActionListener {
	//private WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2; 
	private WindowAdminUpdateLecture3 windowAdminUpdateLecture3;
	private WindowAdminMenuPanel windowAdminMenuPanel;
	private WindowAdminLoginPanel windowAdminLoginPanel;
	
	public Goback(WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2, WindowAdminUpdateLecture3 windowAdminUpdateLecture3,
			WindowAdminMenuPanel windowAdminMenuPanel, WindowAdminLoginPanel windowAdminLoginPanel) {
		//this.windowAdminUpdateLecturePanel2 = windowAdminUpdateLecturePanel2;
		this.windowAdminUpdateLecture3 = windowAdminUpdateLecture3;
		this.windowAdminMenuPanel = windowAdminMenuPanel;
		this.windowAdminLoginPanel = windowAdminLoginPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminMenuPanel.setVisible(true);
		windowAdminUpdateLecture3.setVisible(false);
	}
}
