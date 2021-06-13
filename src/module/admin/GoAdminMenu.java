package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import windowsView.admin.WindowAdminMenuPanel;

public class GoAdminMenu implements ActionListener {
	JPanel windowAdminLectureTable;
	WindowAdminMenuPanel windowAdminMenuPanel;

	public GoAdminMenu(JPanel windowAdminLectureTable, WindowAdminMenuPanel windowAdminMenuPanel) {
		this.windowAdminLectureTable = windowAdminLectureTable;
		this.windowAdminMenuPanel = windowAdminMenuPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminLectureTable.setVisible(false);
		windowAdminMenuPanel.setVisible(true);
	}

}
