package main;

import javax.swing.JFrame;

import constants.Config.FVmainFrame;
import windowsView.WindowInitialPanel;

public class WindowMainFrame extends JFrame{
	
	//attribute
	private static final long serialVersionUID = 1L;
	
	//components
	private WindowInitialPanel windowInitialPanel;
	
	public WindowMainFrame(){
		super();
		//attribute
		this.setSize(FVmainFrame.size);
		this.setLocation(FVmainFrame.location);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
		//components
		this.windowInitialPanel = new WindowInitialPanel(this);
		this.add(windowInitialPanel);
	}
	
	public static void main(String[] args){
		WindowMainFrame mainFrame = new WindowMainFrame();
		mainFrame.setVisible(true);
	}
}
