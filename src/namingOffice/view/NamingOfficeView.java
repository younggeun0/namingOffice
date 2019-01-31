package namingOffice.view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import namingOffice.controller.NamingOfficeController;

public class NamingOfficeView extends JFrame {
	
	JButton jbCreate, jbClose;
	JComboBox<String> jcbYear;
	JRadioButton jrMale, jrFemale;
	JTextField jtfLastName;
	
	public NamingOfficeView() {
		super("Whatever");
		
		jbCreate = new JButton("작명하기");
		jbClose = new JButton("종료");
		
		JPanel panel = new JPanel();
		panel.add(jbCreate);
		panel.add(jbClose);
		
		// 200x170
		JLabel jlLogo = new JLabel(new ImageIcon("D:/git/repositories/namingOffice/UI/logo.jpg"));
		JLabel jlSelectYear = new JLabel("연도선택");
		JLabel jlLastName = new JLabel("성 입력");
		
		String[] items = { "----","2013","2009","2008","2005","1998",
				"1988","1978","1975","1968","1958","1948","1945" };
		jcbYear = new JComboBox<String>(items);
		
		jrMale = new JRadioButton("남성이름", true);
		jrFemale = new JRadioButton("여성이름");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrMale);
		bg.add(jrFemale);
		
		jtfLastName = new JTextField();
		
		setLayout(null);
		
		jlLogo.setBounds(40, 40, 200, 170);
		jrMale.setBounds(60, 240, 80, 30);
		jrFemale.setBounds(150, 240, 80, 30);
		jcbYear.setBounds(130, 280, 110, 30);
		jlSelectYear.setBounds(50, 280, 80, 30);
		jlLastName.setBounds(50, 320, 80, 30);
		jtfLastName.setBounds(130, 320, 110, 30);
		jbCreate.setBounds(50, 370, 100, 30);
		jbClose.setBounds(160, 370, 80, 30);
		
		add(jbClose);
		add(jbCreate);
		add(jtfLastName);
		add(jlLastName);
		add(jlSelectYear);
		add(jcbYear);
		add(jrFemale);
		add(jrMale);
		add(jlLogo);
		
		NamingOfficeController noc = new NamingOfficeController(this);
		jbCreate.addActionListener(noc);
		jbClose.addActionListener(noc);
		addWindowListener(noc);

		setBounds(400, 300, 300, 480);
		setVisible(true);
		setResizable(false);
	}

	public JButton getJbCreate() {
		return jbCreate;
	}

	public JButton getJbClose() {
		return jbClose;
	}

	public JComboBox<String> getJcbYear() {
		return jcbYear;
	}

	public JRadioButton getJrMale() {
		return jrMale;
	}

	public JRadioButton getJrFemale() {
		return jrFemale;
	}

	public JTextField getJtfLastName() {
		return jtfLastName;
	}
	
}
