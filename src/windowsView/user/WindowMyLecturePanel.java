package windowsView.user;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constants.Config.FVall;
import constants.Config.FVmainFrame;
import module.GoMenu;
import module.user.ApplyLecture2;
import valueObject.OHwewon;

public class WindowMyLecturePanel extends JPanel{

	//private
	private static final long serialVersionUID = 1L;
	public JTextField lectureChoiceTxt;
	
	public WindowMyLecturePanel( String message, WindowMenuPanel windowMenuPanel, OHwewon oHwewon, JFrame mainFrame) {
		this.setBounds(0, 0, 600, 422);
		this.setLayout(null);
		this.setSize(FVmainFrame.size);
		this.setBackground(FVall.bgColor);
		this.setVisible(false);
		mainFrame.getContentPane().add(this);
		JLabel bagLabel = new JLabel(message);
		bagLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		bagLabel.setBounds(308, 7, 322, 44);
		this.add(bagLabel);
		
		JButton goMenuBtn = new JButton("← 뒤로가기");
		goMenuBtn.setBounds(16, 19, 117, 31);
		goMenuBtn.addActionListener(new GoMenu(this, windowMenuPanel));
		this.add(goMenuBtn);
		
		lectureChoiceTxt = new JTextField();
		lectureChoiceTxt.setBounds(299, 498, 257, 26);
		add(lectureChoiceTxt);
		lectureChoiceTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("->");
		lblNewLabel_1.setBounds(133, 503, 24, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("(강좌번호를 입력하세요.)");
		lblNewLabel_3.setBounds(309, 525, 190, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("입력:");
		lblNewLabel_4.setBounds(269, 503, 33, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel(FVall.Line);
		lblNewLabel_2.setBounds(16, 435, 778, 16);
		add(lblNewLabel_2);
		
		JButton okBtn = new JButton("입력완료");
		okBtn.setBounds(568, 498, 117, 29);
		okBtn.addActionListener(new ApplyLecture2( this, oHwewon,  lectureChoiceTxt));
		add(okBtn);
		
		JLabel lblNewLabel_5 = new JLabel("● 강좌 옮기기");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(40, 451, 117, 31);
		add(lblNewLabel_5);
	}
}
