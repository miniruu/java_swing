package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import constants.Config.Path;
import controller.CLecture;
import valueObject.OHwewon;
import windowsView.admin.WindowAdminDeleteLecturePanel1;
import windowsView.user.WindowDeleteLecturePanel;

public class DeleteLecture implements ActionListener{
	
	WindowDeleteLecturePanel windowDeleteLecturePanel;
	JTextField deleteTxt;
	OHwewon oHwewon;
	String separator;
	CLecture cLecture;

	public DeleteLecture(WindowDeleteLecturePanel windowDeleteLecturePanel, JTextField deleteTxt, OHwewon oHwewon,
			String separator, CLecture cLecture){
		this.deleteTxt = deleteTxt;
		this.oHwewon = oHwewon;
		this.separator = separator;
		this.windowDeleteLecturePanel = windowDeleteLecturePanel;
		this.cLecture = cLecture;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(separator.equals("미리담기")){
			if(cLecture.deleteLecture(oHwewon, Path.miri, deleteTxt.getText()))
				JOptionPane.showMessageDialog(null, "성공적으로 삭제 되었습니다.");
			else
				JOptionPane.showMessageDialog(null, "삭제에 실패하였습니다. 강좌번호를 다시 확인하세요.");
		}else{
			
			if(cLecture.deleteLecture(oHwewon, Path.sugang, deleteTxt.getText()))
				JOptionPane.showMessageDialog(null, "성공적으로 삭제 되었습니다.");
			else
				JOptionPane.showMessageDialog(null, "삭제에 실패하였습니다. 강좌번호를 다시 확인하세요.");
		}
	}
}
