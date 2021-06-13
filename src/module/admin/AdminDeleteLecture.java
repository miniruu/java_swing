package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.CLecture;
import windowsView.admin.WindowAdminDeleteLecturePanel2;

public class AdminDeleteLecture implements ActionListener {
	JTextField lectureChoiceTxt;
	CLecture cLecture;

	public AdminDeleteLecture(JTextField lectureChoiceTxt) {
		this.lectureChoiceTxt = lectureChoiceTxt;
		this.cLecture = new CLecture();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(cLecture.deleteLecture(GoAdminDeleteLecture2.mainPath, lectureChoiceTxt.getText())){
			JOptionPane.showMessageDialog(null, "강의를 삭제하였습니다.");
		}else {
			JOptionPane.showMessageDialog(null, "강의를 삭제에 실패하였습니다.");
		}

	}

}
