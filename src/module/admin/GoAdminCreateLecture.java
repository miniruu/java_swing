package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import constants.Config.Path;
import controller.CIndex;
import valueObject.OLecture;
import windowsView.admin.WindowAdminCreateLecturePanel1;
import windowsView.admin.WindowAdminCreateLecturePanel2;

public class GoAdminCreateLecture implements ActionListener{
	WindowAdminCreateLecturePanel1 windowAdminCreateLecturePanel1;
	WindowAdminCreateLecturePanel2 windowAdminCreateLecturePanel2;
	JTextField pathTextFiled;

	public GoAdminCreateLecture(WindowAdminCreateLecturePanel1 windowAdminCreateLecturePanel1, WindowAdminCreateLecturePanel2 windowAdminCreateLecturePanel2, JTextField pathTextFiled) {
		this.pathTextFiled = pathTextFiled;
		this.windowAdminCreateLecturePanel1 = windowAdminCreateLecturePanel1;
		this.windowAdminCreateLecturePanel2 = windowAdminCreateLecturePanel2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		windowAdminCreateLecturePanel1.setVisible(false);
		windowAdminCreateLecturePanel2.setVisible(true);

	}
}
