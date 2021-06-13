package module.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import valueObject.OHwewon;
import windowsView.user.WindowLecturePanel1;
import windowsView.user.WindowLoginPanel;
import windowsView.user.WindowMenuPanel;

public class SelectLecture implements ActionListener{
	private OHwewon oHwewon;
	private WindowMenuPanel windowMenuPanel;
	private String message;
	private JFrame mainFrame;
	private WindowLecturePanel1 windowLecturePanel1;
	public SelectLecture( WindowMenuPanel windowMenuPanel, String message, JFrame mainFrame, OHwewon oHwewon, WindowLecturePanel1 windowLecturePanel1){
		this.windowMenuPanel = windowMenuPanel;
		this.message = message;
		this.mainFrame = mainFrame;
		this.oHwewon = oHwewon;
		this.windowLecturePanel1 = windowLecturePanel1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		this.windowLecturePanel1 = new WindowLecturePanel1(this.message, this.windowMenuPanel, this.oHwewon, this.mainFrame);
		this.mainFrame.add(windowLecturePanel1);
		this.windowMenuPanel.setVisible(false);
		windowLecturePanel1.setVisible(true);
	}
}	
