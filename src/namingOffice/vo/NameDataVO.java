package namingOffice.vo;

public class NameDataVO {
	
	private String gender;
	private int year;
	private String lastName;
	private int randomIdx;
	
	public NameDataVO(String gender, int year, String lastName, int randomIdx) {
		this.gender = gender;
		this.year = year;
		this.lastName = lastName;
		this.randomIdx = randomIdx;
	}

	public String getGender() {
		return gender;
	}

	public int getYear() {
		return year;
	}

	public String getLastName() {
		return lastName;
	}

	public int getRandomIdx() {
		return randomIdx;
	}
	
	
	
}
