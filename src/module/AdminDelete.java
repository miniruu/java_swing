package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.CLecture;
import valueObject.OLecture;
import windowsView.admin.WindowAdminLoginPanel;
import windowsView.admin.WindowAdminUpdateLecture3;
import windowsView.admin.WindowAdminUpdateLecturePanel2;

public class AdminDelete implements ActionListener {
	private JTextField newLecId;
	private JTextField newLecName;
	private JTextField newProfName;
	private JTextField newCredit;
	private JTextField newLecTime;
	private OLecture beforeLecture;
	private String mainPath;

	public AdminDelete(JTextField newLecId, JTextField newLecName, JTextField newProfName, JTextField newCredit, JTextField newLecTime,
			OLecture beforeLecture, String mainPath) {
		this.newLecId =newLecId;
		this.newLecName=newLecName;
		this.newProfName=newProfName;
		this.newCredit=newCredit;
		this.newLecTime=newLecTime;
		this.beforeLecture=beforeLecture;
		this.mainPath = mainPath;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CLecture cLecture = new CLecture();
		if(cLecture.adminUpdate(mainPath, beforeLecture.getId(), newLecId.getText(), newLecName.getText(), newProfName.getText(),newCredit.getText(), newLecTime.getText()))
			JOptionPane.showMessageDialog(null, "강의 수정에 성공하셨습니다.");
		else
			JOptionPane.showMessageDialog(null, "강의 수정에 실패하였습니다.");
	}
}
