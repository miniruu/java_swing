package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import controller.CLecture;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowsView.user.WindowMenuPanel;
import windowsView.user.WindowMyLecturePanel;

public class ApplyLecture2 implements ActionListener {

	OHwewon oHwewon;
	WindowMyLecturePanel windowMyLecturePanel;
	JTextField lectureChoiceTxt;

	public ApplyLecture2(WindowMyLecturePanel windowMyLecturePanel, OHwewon oHwewon, JTextField lectureChoiceTxt) {
		this.oHwewon = oHwewon;
		this.lectureChoiceTxt = lectureChoiceTxt;
		this.windowMyLecturePanel = windowMyLecturePanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String selectedLecNum = lectureChoiceTxt.getText();
		Vector<OLecture> lecture = new Vector<OLecture>();
		CLecture cLecture = new CLecture();
		int mOrs = 0;
		// 선택된 강의 번호가 미리담기에 있다면 미리담기 -> 수강신청임
		lecture = cLecture.readAllLecs(oHwewon.getId(), FVall.MiriPath);
		for (int i = 0; i < lecture.size(); i++){

			if (selectedLecNum.equals(lecture.get(i).getId())) {
				Vector<OLecture> myLectures = new Vector<OLecture>();
				myLectures.add(lecture.get(i));
				cLecture.carryLecs(oHwewon, FVall.MiriPath, FVall.SugangPath, myLectures);
				mOrs = 1;
				break;
			}
		}
		if (mOrs == 0){
			// 수강신청 -> 미리담기인 경우
			lecture = cLecture.readAllLecs(oHwewon.getId(), FVall.SugangPath);
			for (int i = 0; i < lecture.size(); i++) {
				if (selectedLecNum.equals(lecture.get(i).getId())) {
					Vector<OLecture> myLectures = new Vector<OLecture>();
					myLectures.add(lecture.get(i));
					cLecture.carryLecs(oHwewon, FVall.SugangPath, FVall.MiriPath, myLectures);
					break;
				}
			}

		}
		JOptionPane.showMessageDialog(null, "옮기기에 상공하셨습니다.");
	}
}
