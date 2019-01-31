package namingOffice.preprocess;

public class InsertDataVO {
	
	private String f_name, m_name;
	private int year, rank;
	
	public InsertDataVO(String f_name, String m_name, int year, int rank) {
		this.f_name = f_name;
		this.m_name = m_name;
		this.year = year;
		this.rank = rank;
	}

	public String getF_name() {
		return f_name;
	}

	public String getM_name() {
		return m_name;
	}

	public int getYear() {
		return year;
	}

	public int getRank() {
		return rank;
	}
}
