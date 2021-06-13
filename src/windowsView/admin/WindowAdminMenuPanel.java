
package windowsView.admin;

import javax.swing.JPanel;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.GoMain;
import module.admin.GoAdminDeleteLecture;
import module.admin.GoAdminLectureTable;
import module.admin.GoAdminUpdateLecture;
import windowsView.WindowInitialPanel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowAdminMenuPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private WindowAdminCreateLecturePanel1 windowAdminCreateLecturePanel1;
	private WindowAdminDeleteLecturePanel1 windowAdminDeleteLecturePanel1;
	private WindowUpdateLecturePanel1 windowUpdateLecturePanel1;
	public WindowAdminMenuPanel(WindowAdminLoginPanel windowAdminLoginPanel, JFrame mainFrame, WindowInitialPanel windowInitialPanel){
		
		this.setBounds(0, 0, 600, 422);
		this.setLayout(null);
		this.setBackground(FVall.adminBgColor);
		this.setSize(FVmainFrame.size);
		
		windowAdminCreateLecturePanel1 = new WindowAdminCreateLecturePanel1(this, mainFrame);
		windowAdminDeleteLecturePanel1 = new WindowAdminDeleteLecturePanel1(this, mainFrame);
		windowUpdateLecturePanel1 = new WindowUpdateLecturePanel1(this, mainFrame, windowAdminLoginPanel);
		mainFrame.add(windowAdminCreateLecturePanel1);
		mainFrame.add(windowAdminDeleteLecturePanel1);
		mainFrame.add(windowUpdateLecturePanel1);
		
		JLabel lblNewLabel = new JLabel("관리자 화면입니다.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(311, 35, 160, 54);
		add(lblNewLabel);
		
		JButton createLectureButton = new JButton("강좌 추가하기");
		createLectureButton.setBounds(311, 143, 160, 54);
		createLectureButton.addActionListener(new GoAdminLectureTable(this, windowAdminCreateLecturePanel1));
		add(createLectureButton);
		
		JButton deleteLectureButton = new JButton("강좌 삭제하기");
		deleteLectureButton.setBounds(311, 255, 160, 54);
		deleteLectureButton.addActionListener(new GoAdminDeleteLecture(this, windowAdminDeleteLecturePanel1));
		add(deleteLectureButton);
		
		JButton updateLectureButton = new JButton("강좌 수정하기");
		updateLectureButton.setBounds(311, 369, 160, 54);
		updateLectureButton.addActionListener(new GoAdminUpdateLecture(this, windowUpdateLecturePanel1, windowAdminLoginPanel));
		add(updateLectureButton);
		
		JButton goMainButton = new JButton("메인화면으로");
		goMainButton.setBounds(44, 52, 117, 29);
		add(goMainButton);
		goMainButton.addActionListener(new GoMain(this, windowInitialPanel));
		this.setVisible(false);
	}
}
