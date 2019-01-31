package namingOffice.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import namingOffice.vo.InsertDataVO;
import namingOffice.vo.NameDataVO;

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
	
	public String selectRandomName(NameDataVO ndvo) throws SQLException {
		String msg = "";
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
			
			con = getConn();
			
			cstmt = con.prepareCall("{ call select_name(?,?,?,?,?) }");
			cstmt.setString(1, ndvo.getGender());
			cstmt.setInt(2, ndvo.getYear());
			cstmt.setString(3, ndvo.getLastName());
			cstmt.setInt(4, ndvo.getRandomIdx());
			cstmt.registerOutParameter(5, Types.VARCHAR);
			
			cstmt.execute();
			
			msg = cstmt.getString(5);
			
		} finally {
			if (cstmt != null) { cstmt.close(); }
			if (con != null) { con.close(); }
		}
		
		
		return msg;
	}
	
	public void insertData(InsertDataVO idvo) throws SQLException { // 이름 데이터 넣는 method
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = getConn();
			
			String insertSql = "insert into name_rank(year, rank, gender, name) values(?,?,?,?)";
			pstmt = con.prepareStatement(insertSql);
			pstmt.setInt(1, idvo.getYear());
			pstmt.setInt(2, idvo.getRank());
			pstmt.setString(3, idvo.getGender());
			pstmt.setString(4, idvo.getName());
			
			pstmt.executeUpdate();
			
		} finally {
			if (pstmt != null) { pstmt.close(); }
			if (con != null) { con.close(); }
		}
	}
}
