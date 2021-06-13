package windowsView.user;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import controller.CLecture;
import module.GoBackLogin;
import module.GoMain;
import module.user.GoDeleteLecture;
import module.user.GoInfo;
import module.user.GoLogin;
import module.user.MyLectureTable;
import module.user.SelectLecture;
import valueObject.OHwewon;
import windowsView.WindowInitialPanel;

import java.awt.Color;

public class WindowMenuPanel extends JPanel{
	
	//private
	private static final long serialVersionUID = 1L;
	
	private WindowLecturePanel1 windowLecturePanel1;
	private WindowMyLecturePanel windowMyLecturePanel;
	private WindowMyInfoPanel windowMyInfoPanel;
	private WindowDeleteLecturePanel windowDeleteLecturePanel;
	private CLecture cLecture;
	
	
	public WindowMenuPanel(WindowLoginPanel windowLoginPanel, JFrame mainFrame, OHwewon oHwewon){
		this.setVisible(false);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setLayout(null);
		this.cLecture = new CLecture();
		
		JLabel menuLabel = new JLabel("매뉴를 선택하세요.");
		menuLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		menuLabel.setBounds(318, 22, 174, 53);
		this.add(menuLabel);
		
		JButton sugangBtn = new JButton("수강신청");
		sugangBtn.setBounds(227, 151, 117, 39);
		sugangBtn.addActionListener(new SelectLecture(this, "수강신청", mainFrame, oHwewon, windowLecturePanel1));
		this.add(sugangBtn);
		
		JButton miriBtn = new JButton("미리담기");
		miriBtn.setBounds(453, 151, 117, 39);
		miriBtn.addActionListener(new SelectLecture(this, "미리담기", mainFrame, oHwewon, windowLecturePanel1));
		this.add(miriBtn);
		
		JButton goBagButton = new JButton("책가방 보기");
		goBagButton.setBounds(453, 230, 117, 39);
		goBagButton.addActionListener(new MyLectureTable(this, oHwewon,  "bag", mainFrame, windowMyLecturePanel, cLecture));
		this.add(goBagButton);
		
		JButton goMyLectureButton = new JButton("수강신청 내역보기");
		goMyLectureButton.setBounds(227, 230, 117, 39);
		goMyLectureButton.addActionListener(new MyLectureTable(this, oHwewon,  "apply", mainFrame, windowMyLecturePanel, cLecture));
		this.add(goMyLectureButton);
		
		JButton deleteSugangLecBtn = new JButton("수강신청 취소하기");
		deleteSugangLecBtn.setBounds(227, 301, 117, 39);
		deleteSugangLecBtn.addActionListener(new GoDeleteLecture(this, deleteSugangLecBtn.getText(), oHwewon, mainFrame, windowDeleteLecturePanel, cLecture));
		add(deleteSugangLecBtn);
		
		JButton deleteMiriLecBtn = new JButton("미리담기 취소하기");
		deleteMiriLecBtn.setBounds(453, 301, 117, 39);
		deleteMiriLecBtn.addActionListener(new GoDeleteLecture(this, deleteMiriLecBtn.getText(), oHwewon, mainFrame, windowDeleteLecturePanel, cLecture));
		add(deleteMiriLecBtn);
		
		JButton myInfoButton = new JButton("나의 정보 보기");
		myInfoButton.setBackground(new Color(95, 158, 160));
		myInfoButton.setBounds(573, 39, 117, 29);
		myInfoButton.addActionListener(new GoInfo(this, oHwewon, mainFrame, windowMyInfoPanel));
		add(myInfoButton);
		
		JButton btnNewButton = new JButton("← 뒤로가기");
		btnNewButton.setBounds(47, 39, 117, 29);
		btnNewButton.addActionListener(new GoBackLogin(this, windowLoginPanel));
		add(btnNewButton);
	}

}
