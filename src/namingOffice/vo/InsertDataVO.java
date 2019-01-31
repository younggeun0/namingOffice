package namingOffice.vo;

public class InsertDataVO {
	
	private String name, gender;
	private int year, rank;
	
	public InsertDataVO(String name, String gender, int year, int rank) {
		this.name = name;
		this.gender = gender;
		this.year = year;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getYear() {
		return year;
	}

	public int getRank() {
		return rank;
	}
}
