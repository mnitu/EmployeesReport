package unicredit.eu;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	
	List<Student> students;
	
	public StudentDAOImpl() {
		
		students = new ArrayList<Student>();
		
		Student stud1 = new Student(1, "Nitu Madalin");
		Student stud2 = new Student(2, "Ionica Adrian");
			
		students.add(stud1);
		students.add(stud2);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int studID) {
		// TODO Auto-generated method stub
		for (Student stud : students) {
			if ( stud.getStudID() == studID ) {
				return stud;
			}
		}
		
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getStudID()).setName(student.getName());
		System.out.println(" Student : " + student.getStudID() + " was updated!");		
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getStudID());
		System.out.println(" Student " + student.getStudID() + " was removed from the list!");
	}

}
