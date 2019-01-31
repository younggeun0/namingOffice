package namingOffice.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

import namingOffice.dao.NamingDAO;
import namingOffice.view.NamingOfficeView;
import namingOffice.vo.NameDataVO;

public class NamingOfficeController extends WindowAdapter implements ActionListener {

	private NamingOfficeView nov;
	
	public NamingOfficeController(NamingOfficeView nov) {
		this.nov = nov;
	}
	
	private void msgCenter(String msg) {
		JOptionPane.showMessageDialog(nov, msg);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nov.getJbCreate()) {
			String gender = "";
			
			if (nov.getJrFemale().isSelected()) {
				gender = "f";
			} else {
				gender = "m";
			}

			int year = 0;
			
			if (nov.getJcbYear().getSelectedIndex() == 0) {
				msgCenter("연도를 선택하세요.");
				return;
			}
			
			year = Integer.parseInt((String)nov.getJcbYear().getSelectedItem());
			
			if (nov.getJtfLastName().getText().trim().isEmpty()) {
				msgCenter("성을 입력해주세요.");
				return;
			}
			
			String lastName = nov.getJtfLastName().getText().trim();
			
			Random r = new Random();
			int idx = r.nextInt(10) + 1;
			
			NameDataVO ndvo = new NameDataVO(gender, year, lastName, idx);
			
			String msg = "";
			
			try {
				msg = NamingDAO.getInstance().selectRandomName(ndvo);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			msgCenter(msg);
		}
		
		if(e.getSource() == nov.getJbClose()) {
			nov.dispose();
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		nov.dispose();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);
	}
}
