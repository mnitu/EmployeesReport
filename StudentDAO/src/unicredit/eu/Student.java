package unicredit.eu;

public class Student {
	
	private int studID;
	private String name;
	
	public Student(int studID, String name) {
		this.studID = studID;
		this.name = name;
	}
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
