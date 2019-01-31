package namingOffice.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import namingOffice.controller.NamingOfficeController;

public class NamingOfficeView extends JFrame {
	
	JButton jbCreate, jbClose;
	
	public NamingOfficeView() {
		super("Young's Naming Office");
		
		jbCreate = new JButton("작명하기");
		jbClose = new JButton("종료");
		
		JPanel panel = new JPanel();
		
		NamingOfficeController noc = new NamingOfficeController(this);
		jbCreate.addActionListener(noc);
		jbClose.addActionListener(noc);
		addWindowListener(noc);

		setBounds(400, 300, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
