package namingOffice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import namingOffice.preprocess.InsertDataVO;

public class NamingDAO {

	private static NamingDAO n_dao;
	
	private NamingDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static NamingDAO getInstance() { 
		if (n_dao == null) {
			n_dao = new NamingDAO();
		}
		
		return n_dao;
	}
	
	public Connection getConn() {
		
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void insertData(InsertDataVO idvo) throws SQLException { // 이름 데이터 넣는 method
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = getConn();
			
			String insertSql = "insert into name_rank(year, rank, m_name, f_name) values(?,?,?,?)";
			pstmt = con.prepareStatement(insertSql);
			pstmt.setInt(1, idvo.getYear());
			pstmt.setInt(2, idvo.getRank());
			pstmt.setString(3, idvo.getM_name());
			pstmt.setString(4, idvo.getF_name());
			
			pstmt.executeUpdate();
			
		} finally {
			if (con != null) { con.close(); }
			if (pstmt != null) { pstmt.close(); }
		}
	}
}
