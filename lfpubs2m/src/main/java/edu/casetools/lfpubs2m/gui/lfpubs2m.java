package edu.casetools.lfpubs2m.gui;

import javax.swing.JFrame;


public class lfpubs2m extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public void run() {
		lfpubs2m thisClass = new lfpubs2m();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}
	public lfpubs2m() {
		super();
		initialize();
	}
	private void initialize() {
		this.setSize(1169, 643);
		menuTabbed menuTabbedOptions = new menuTabbed();
		this.setJMenuBar(menuTabbedOptions.getJMenuBar());
		this.setContentPane(menuTabbedOptions.getJTabbedPane());
		this.setTitle("LFPUBS To M");
	}
}

