package module.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import constants.Config.Path;
import controller.CIndex;
import controller.CLecture;
import valueObject.OLecture;

public class CreateLecture implements ActionListener {
	
	private JTextField lecutreId;
	private JTextField profName;
	private JTextField lectureName;
	private JTextField credits;
	private JTextField time;
	private JTextField pathTextFiled;
	private CLecture cLecture;
	private CIndex cIndex;

	public CreateLecture(JTextField lecutreId, JTextField profName, JTextField lectureName, JTextField credits,
			JTextField time, JTextField pathTextFiled, CIndex cIndex, CLecture cLecture) {
		this.lecutreId = lecutreId;
		this.lectureName = lectureName;
		this.profName = profName;
		this.time = time;
		this.credits = credits;
		this.pathTextFiled = pathTextFiled;
		this.cIndex = cIndex;
		this.cLecture = cLecture;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*강좌 경로를 가져오는 코드*/
		String mainPath = Path.campusPath;
		String path_ = this.pathTextFiled.getText();
		String[] path = path_.split("/");
		for(int i=0; i<3; i++){
			mainPath = Path.pPath + cIndex.show(mainPath, path[i]);
		}

		OLecture newLecture = new OLecture(lecutreId.getText(), lectureName.getText(), profName.getText(), credits.getText(), time.getText());

		if(cLecture.adminCreate(mainPath, newLecture))
			JOptionPane.showMessageDialog(null, "강의를 성공적으로 추가하였습니다.");
		else
			JOptionPane.showMessageDialog(null, "강의를 추가하는데 실패하였습니다.");
	}

}
