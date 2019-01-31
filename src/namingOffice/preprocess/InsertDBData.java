package namingOffice.preprocess;

import java.sql.SQLException;

import namingOffice.dao.NamingDAO;
import namingOffice.vo.InsertDataVO;

public class InsertDBData {

	public InsertDBData() {
		
		// 1945�� �̸�����
		String[] f_name1945 = { 
			"����","����","����","����","����", 
			"����","����","����","����","ȭ��"
		};
		String[] m_name1945 = {
			"����","��ȣ","����","����","����", 
			"����","����","����","����","�߼�"	
		};
		// 1948��
		String[] f_name1948 = {
			"����","����","����","����","����",
			"����","����","����","����","����"
		};
		String[] m_name1948 = {
			"����","��ȣ","����","��ö","����",
			"����","����","��ȣ","��ȯ","����"
		};
		//1958
		String[] f_name1958 = {
			"����","����","����","���","���",
			"����","����","����","����","����"
		};
		String[] m_name1958 = {
			"����","��ö","��ȣ","����","����",
			"��ȣ","��ö","����","���","��ȣ"
		};
		//1968
		String[] f_name1968 = {
			"�̰�","�̼�","����","���","����",
			"�̿�","����","����","����","����"
		};
		String[] m_name1968 = {
			"��ȣ","����","��ȣ","��ö","��ȣ",
			"����","��ö","��ȣ","����","��ȣ"
		};
		//1975
		String[] f_name1975 = {
			"�̿�","����","����","����","����",
			"����","����","�̰�","����","����"
		};
		String[] m_name1975 = {
			"����","��ȣ","����","����","��ȣ",
			"����","����","����","����","��ȣ"	
		};
		//1978
		String[] f_name1978 = {
			"����","����","�̿�","����","����",
			"����","����","����","����","����"
		};
		String[] m_name1978 = {
			"����","����","����","����","����",
			"��ȣ","��ȣ","��ȣ","����","�μ�"
		};
		//1988
		String[] f_name1988 = {
			"����","����","����","����","����",
			"����","�Ƹ�","����","����","����"
		};
		String[] m_name1988 = {
			"����","����","����","����","����",
			"�ؿ�","�μ�","��ȣ","����","����"
		};
		//1998��
		String[] f_name1998 = {
			"����","����","����","����","����",
			"����","����","����","����","����"
		};
		String[] m_name1998 = {
			"����","����","����","����","��ȣ",
			"�μ�","�μ�","����","�ؿ�","����"	
		};
		//2005��
		String[] f_name2005 = {
			"����","�μ�","����","����","����",
			"����","����","����","����","����"
		};
		String[] m_name2005 = {
			"����","����","����","����","����",
			"����","����","�ؿ�","����","�¹�"
		};
		//2008��
		String[] f_name2008 = {
			"����","�μ�","����","����","����",
			"����","����","����","����","����"
		};
		String[] m_name2008 = {
			"����","����","����","�ؼ�","����",
			"�ǿ�","����","����","����","����"	
		};
		//2009��
		String[] f_name2009 = {
			"����","�μ�","����","����","����",
			"����","����","����","����","����"
		};
		String[] m_name2009 = {
			"����","����","����","�ؼ�","����",
			"����","�ǿ�","����","����","����"
		};
		//2013��
		String[] f_name2013 = {
			"����","����","����","����","�μ�",
			"����","ä��","����","����","����"
		};
		String[] m_name2013 = {
			"����","����","�ֿ�","����","�ÿ�",
			"�ؼ�","����","����","�ǿ�","����"
		};
		
		NamingDAO n_dao = NamingDAO.getInstance();
		
		InsertDataVO idvo = null;
		try {
			
			//1945�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1945[i], "f", 1945, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1945[i], "m", 1945, i+1);
				n_dao.insertData(idvo);
			}
			//1948�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1948[i], "f", 1948, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1948[i], "m", 1948, i+1);
				n_dao.insertData(idvo);
			}
			//1958�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1958[i], "f", 1958, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1958[i], "m", 1958, i+1);
				n_dao.insertData(idvo);
			}
			//1968�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1968[i], "f", 1968, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1968[i], "m", 1968, i+1);
				n_dao.insertData(idvo);
			}
			//1975�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1975[i], "f", 1975, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1975[i], "m", 1975, i+1);
				n_dao.insertData(idvo);
			}
			//1978�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1978[i], "f", 1978, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1978[i], "m", 1978, i+1);
				n_dao.insertData(idvo);
			}
			//1988�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1988[i], "f", 1988, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1988[i], "m", 1988, i+1);
				n_dao.insertData(idvo);
			}
			//1998�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1998[i], "f", 1998, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1998[i], "m", 1998, i+1);
				n_dao.insertData(idvo);
			}
			//2005�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2005[i], "f", 2005, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2005[i], "m", 2005, i+1);
				n_dao.insertData(idvo);
			}
			//2008�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2008[i], "f", 2008, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2008[i], "m", 2008, i+1);
				n_dao.insertData(idvo);
			}
			//2009�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2009[i], "f", 2009, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2009[i], "m", 2009, i+1);
				n_dao.insertData(idvo);
			}
			//2013�⵵ ������ insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2013[i], "f", 2013, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2013[i], "m", 2013, i+1);
				n_dao.insertData(idvo);
			}
			
			System.out.println("�����Ͱ� ������ �����ϴ�.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InsertDBData();
	}
}
