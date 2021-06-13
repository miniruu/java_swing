package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextField;

import constants.Config.Path;
import controller.CIndex;
import controller.CLecture;
import valueObject.OLecture;
import windowsView.admin.WindowAdminLoginPanel;
import windowsView.admin.WindowAdminMenuPanel;
import windowsView.admin.WindowAdminUpdateLecture3;
import windowsView.admin.WindowAdminUpdateLecturePanel2;

public class GoAdminUpdateLecture3 implements ActionListener {
	private WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2;
	private JTextField pathTextFiled;
	private WindowAdminUpdateLecture3 windowAdminUpdateLecture3;
	private WindowAdminMenuPanel windowAdminMenuPanel;
	private WindowAdminLoginPanel windowAdminLoginPanel;
	private JTextField lecIdTextField;
	private JFrame mainFrame;
	private CIndex cIndex;
	private CLecture cLecture;

	public GoAdminUpdateLecture3(WindowAdminUpdateLecturePanel2 windowAdminUpdateLecturePanel2,
			JTextField pathTextFiled, WindowAdminMenuPanel windowAdminMenuPanel, WindowAdminUpdateLecture3 windowAdminUpdateLecture3, JTextField lecIdTextField, JFrame mainFrame, WindowAdminLoginPanel windowAdminLoginPanel) {
		this.windowAdminUpdateLecturePanel2 = windowAdminUpdateLecturePanel2;
		this.windowAdminUpdateLecture3 = windowAdminUpdateLecture3;
		this.pathTextFiled = pathTextFiled;
		this.lecIdTextField = lecIdTextField;
		this.windowAdminMenuPanel = windowAdminMenuPanel;
		this.windowAdminLoginPanel = windowAdminLoginPanel;
		this.mainFrame = mainFrame;
		this.cIndex = new CIndex();
		this.cLecture = new CLecture();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		windowAdminUpdateLecturePanel2.setVisible(false);
		
		String mainPath = Path.campusPath;
		String path_ = pathTextFiled.getText();
		String[] path = path_.split("/");
		
		for(int i=0; i<3; i++) {
			mainPath = Path.pPath + cIndex.show(mainPath, path[i]);
		}
		Vector<OLecture> lectures = cLecture.show(mainPath);
		String beforeLecId = lecIdTextField.getText();
		OLecture beforeLecture = null;
		for(int i=0; i<lectures.size(); i++) {
			if(lectures.get(i).getId().equals(beforeLecId)){
				beforeLecture = lectures.get(i);
				break;
			}
		}
		windowAdminUpdateLecture3 = new WindowAdminUpdateLecture3(windowAdminMenuPanel, windowAdminUpdateLecturePanel2, mainPath, beforeLecture, windowAdminLoginPanel);
		windowAdminUpdateLecture3.setVisible(true);
		mainFrame.add(windowAdminUpdateLecture3);

	}

}
