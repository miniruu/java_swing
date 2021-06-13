package module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import constants.Config.FVLecturePanelYongin;

public class YCombo implements ActionListener {
	private JComboBox<?> yonginComboBox;
	private JComboBox<?> yColleges;

	public YCombo( JComboBox<?> yColleges, JComboBox<?> yonginComboBox) {
		this.yColleges = yColleges;
		this.yonginComboBox = yonginComboBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int yComboIndex = yonginComboBox.getSelectedIndex();
		if (yComboIndex == 0) {//교양
			yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.gyoyang));
		} else if (yComboIndex == 1) {//공과
			yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.gongGwa));
		} else if (yComboIndex == 2) {//자연
			yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.jayeun));
		} else if (yComboIndex == 3) {//예술
			yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.art));
		} else {//건축
			yColleges.setModel( new DefaultComboBoxModel(FVLecturePanelYongin.gunchuk));
		}

	}

}
