package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.Path;
import controller.CLecture;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowsView.user.WindowLecturePanel2;
import windowsView.user.WindowMenuPanel;

public class ApplyLecture implements ActionListener {

	private JTextField lectureChoiceTxt;
	private String message;
	private OHwewon oHwewon;
	private CLecture cLecture;
	
	public ApplyLecture(JTextField lectureChoiceTxt, String message, OHwewon oHwewon, CLecture cLecture) {
		this.lectureChoiceTxt = lectureChoiceTxt;
		this.message = message;
		this.oHwewon = oHwewon;
		this.cLecture = cLecture;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String path = "";
		if(this.message.equals("미리담기")){
			path = Path.pPath+Path.miri;
		}else{
			path = Path.pPath+Path.sugang;
		}
		String selectedLecNum = lectureChoiceTxt.getText();
		Vector<OLecture> lecture = new Vector<OLecture>();
		Vector<OLecture> bagLectures = GoLectureTable.bagLectures;

		for (int i = 0; i < bagLectures.size(); i++){
			if (bagLectures.get(i).getId().equals(selectedLecNum)){
				lecture.add(bagLectures.get(i));
				break;
			}
		}
		int result = cLecture.saveAllLecs(oHwewon, lecture, path);
		System.out.println("result:"+result);
		if (result==-1)
			JOptionPane.showMessageDialog(null, message+"에 실패하셨습니다.\n이미 신청하신 강좌인지 확인해보세요");
		else if(result==0)
			JOptionPane.showMessageDialog(null, message+"에 실패하셨습니다.\n수강 가능 학점을초과하였습니다.");
		else
			JOptionPane.showMessageDialog(null, message+"에 성공하셨습니다.");
	}
}
