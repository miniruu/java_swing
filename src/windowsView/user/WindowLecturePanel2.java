package windowsView.user;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CLecture;
import module.GoMenu;
import module.user.ApplyLecture;
import valueObject.OHwewon;

public class WindowLecturePanel2 extends JPanel{
	//private
	private static final long serialVersionUID = 1L;
	private CLecture cLecture;
	
	public WindowLecturePanel2(WindowMenuPanel windowMenuPanel, String message, OHwewon oHwewon, JFrame mainFrame){
		this.setBounds(0, 0, 600, 422);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setLayout(null);
		this.setVisible(false);
		this.cLecture = new CLecture();
		
		mainFrame.add(this);
		JLabel lectureMiriLabel = new JLabel("강좌 선택");
		lectureMiriLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lectureMiriLabel.setBounds(313, 18, 102, 31);
		this.add(lectureMiriLabel);
		this.setVisible(false);

		JButton GoMenuBtn = new JButton("← 뒤로가기");
		GoMenuBtn.setBounds(43, 23, 127, 31);
		GoMenuBtn.addActionListener(new GoMenu(this, windowMenuPanel));
		this.add(GoMenuBtn);

		JTextField lectureChoiceTxt = new JTextField();
		lectureChoiceTxt.setBounds(301, 398, 177, 26);
		this.add(lectureChoiceTxt);
		lectureChoiceTxt.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("강좌번호 입력:");
		lblNewLabel_7.setBounds(222, 403, 80, 16);
		this.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("(예:통계학계론의 강좌번호가 211인 경우, 211만 입력)");
		lblNewLabel_8.setBounds(220, 435, 282, 16);
		this.add(lblNewLabel_8);
		
		JButton applyLectureBtn = new JButton(message+"하기");
		applyLectureBtn.addActionListener(new ApplyLecture(lectureChoiceTxt, message, oHwewon, cLecture));
		applyLectureBtn.setBounds(490, 398, 117, 29);
		this.add(applyLectureBtn);
		this.setVisible(false);
	}
}
