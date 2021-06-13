package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import constants.Config.FVLecturePanelSeoul;
import constants.Config.FVLecturePanelYongin;

public class SCombo implements ActionListener {
	private JComboBox<?> seoulComboBox;
	private JComboBox<?> sCollege;

	public SCombo(JComboBox<?> sCollege, JComboBox<?> seoulComboBox) {
		this.sCollege = sCollege;
		this.seoulComboBox = seoulComboBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int yComboIndex = seoulComboBox.getSelectedIndex();
		if (yComboIndex == 0) {//교양
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.gyoyang));
		} else if (yComboIndex == 1) {//ict
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.ict));
		} else if (yComboIndex == 2) {//경영
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.gyung0));
		} else if (yComboIndex == 3) {//인문
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.inmun));
		} else if(yComboIndex == 4){//사회과확
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.socialSience));
		}else {//법
			sCollege.setModel( new DefaultComboBoxModel(FVLecturePanelSeoul.law));
		}
	}
}
