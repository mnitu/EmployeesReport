package unicredit.eu;

import java.util.List;

public class MainApp {
	
	public static void main( String args[] ){
		
		StudentDAO studDAO = new StudentDAOImpl();
		printStudents(studDAO.getAllStudents());
		
		System.out.println("Get Student after ID:\n " + studDAO.getStudent(1).getStudID() + ", " + studDAO.getStudent(1).getName() );
		
		System.out.println("Update Student \n");
		Student upStud = new Student(1, "Gigel Frone");
		
		studDAO.updateStudent(upStud);
		printStudents(studDAO.getAllStudents());
		
		System.out.println("Delete Student : \n");
		studDAO.deleteStudent(upStud);
		printStudents(studDAO.getAllStudents());
		
		System.out.println("Github test 20.05.2016");
	}
	
	public static void printStudents(List<Student> students) {
		for (Student stud : students) {
			System.out.println(" Student " + stud.getStudID() + ", name " + stud.getName() + "\n");
		}
	}

}
