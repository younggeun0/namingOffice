package namingOffice.preprocess;

import java.sql.SQLException;

import namingOffice.dao.NamingDAO;
import namingOffice.vo.InsertDataVO;

public class InsertDBData {

	public InsertDBData() {
		
		// 1945년 이름순위
		String[] f_name1945 = { 
			"영자","정자","순자","춘자","경자", 
			"옥자","명자","숙자","정순","화자"
		};
		String[] m_name1945 = {
			"영수","영호","영식","정웅","영길", 
			"영일","정수","정남","광수","중수"	
		};
		// 1948년
		String[] f_name1948 = {
			"순자","영자","정순","정숙","영숙",
			"영순","정자","영희","정희","옥순"
		};
		String[] m_name1948 = {
			"영수","영호","영식","영철","정수",
			"종수","정식","정호","영환","광수"
		};
		//1958
		String[] f_name1958 = {
			"영숙","정숙","영희","명숙","경숙",
			"순자","정희","순옥","영순","현숙"
		};
		String[] m_name1958 = {
			"영수","영철","영호","영식","성수",
			"성호","상철","종수","경수","상호"
		};
		//1968
		String[] f_name1968 = {
			"미경","미숙","경희","경숙","영숙",
			"미영","영미","정희","정숙","현숙"
		};
		String[] m_name1968 = {
			"성호","영수","영호","영철","정호",
			"영진","병철","진호","성수","재호"
		};
		//1975
		String[] f_name1975 = {
			"미영","은정","은주","은영","현주",
			"은경","지영","미경","현정","미정"
		};
		String[] m_name1975 = {
			"정훈","성호","성훈","성진","정호",
			"상훈","성민","영진","상현","준호"	
		};
		//1978
		String[] f_name1978 = {
			"지영","은정","미영","현정","은주",
			"은영","현주","선영","지연","혜진"
		};
		String[] m_name1978 = {
			"정훈","성훈","상훈","성진","지훈",
			"성호","정호","준호","성민","민수"
		};
		//1988
		String[] f_name1988 = {
			"지혜","지은","수진","혜진","은지",
			"지영","아름","지현","지연","보람"
		};
		String[] m_name1988 = {
			"지훈","성민","현우","정훈","동현",
			"준영","민수","준호","상현","진우"
		};
		//1998년
		String[] f_name1998 = {
			"유진","민지","수빈","지원","지현",
			"지은","현지","은지","예진","예지"
		};
		String[] m_name1998 = {
			"동현","지훈","성민","현우","준호",
			"민석","민수","준혁","준영","승현"	
		};
		//2005년
		String[] f_name2005 = {
			"서연","민서","서현","수빈","유진",
			"민지","서영","지원","수민","예원"
		};
		String[] m_name2005 = {
			"민준","현우","동현","준혁","민재",
			"도현","지훈","준영","현준","승민"
		};
		//2008년
		String[] f_name2008 = {
			"서연","민서","지민","서현","서윤",
			"예은","하은","지우","수빈","윤서"
		};
		String[] m_name2008 = {
			"민준","지훈","현우","준서","우진",
			"건우","예준","현준","도현","동현"	
		};
		//2009년
		String[] f_name2009 = {
			"서연","민서","서현","지우","서윤",
			"지민","수빈","하은","예은","윤서"
		};
		String[] m_name2009 = {
			"민준","지후","지훈","준서","현우",
			"예준","건우","현준","민재","우진"
		};
		//2013년
		String[] f_name2013 = {
			"서연","서윤","지우","서현","민서",
			"윤서","채원","하윤","지아","은서"
		};
		String[] m_name2013 = {
			"민준","서준","주원","예준","시우",
			"준서","도윤","현우","건우","지훈"
		};
		
		NamingDAO n_dao = NamingDAO.getInstance();
		
		InsertDataVO idvo = null;
		try {
			
			//1945년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1945[i], "f", 1945, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1945[i], "m", 1945, i+1);
				n_dao.insertData(idvo);
			}
			//1948년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1948[i], "f", 1948, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1948[i], "m", 1948, i+1);
				n_dao.insertData(idvo);
			}
			//1958년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1958[i], "f", 1958, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1958[i], "m", 1958, i+1);
				n_dao.insertData(idvo);
			}
			//1968년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1968[i], "f", 1968, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1968[i], "m", 1968, i+1);
				n_dao.insertData(idvo);
			}
			//1975년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1975[i], "f", 1975, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1975[i], "m", 1975, i+1);
				n_dao.insertData(idvo);
			}
			//1978년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1978[i], "f", 1978, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1978[i], "m", 1978, i+1);
				n_dao.insertData(idvo);
			}
			//1988년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1988[i], "f", 1988, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1988[i], "m", 1988, i+1);
				n_dao.insertData(idvo);
			}
			//1998년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name1998[i], "f", 1998, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name1998[i], "m", 1998, i+1);
				n_dao.insertData(idvo);
			}
			//2005년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2005[i], "f", 2005, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2005[i], "m", 2005, i+1);
				n_dao.insertData(idvo);
			}
			//2008년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2008[i], "f", 2008, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2008[i], "m", 2008, i+1);
				n_dao.insertData(idvo);
			}
			//2009년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2009[i], "f", 2009, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2009[i], "m", 2009, i+1);
				n_dao.insertData(idvo);
			}
			//2013년도 데이터 insert
			for(int i=0; i<10; i++) {
				idvo = new InsertDataVO(f_name2013[i], "f", 2013, i+1);
				n_dao.insertData(idvo);
				idvo = new InsertDataVO(m_name2013[i], "m", 2013, i+1);
				n_dao.insertData(idvo);
			}
			
			System.out.println("데이터가 무사히 들어갔습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InsertDBData();
	}
}
