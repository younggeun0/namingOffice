package namingOffice.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import namingOffice.view.NamingOfficeView;

public class NamingOfficeController extends WindowAdapter implements ActionListener {

	private NamingOfficeView nov;
	
	public NamingOfficeController(NamingOfficeView nov) {
		this.nov = nov;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		nov.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
