package info.study;

import info.study.model.Enrollee;
import info.study.model.Student;
import info.study.model.Teacher;

public class AppRunner {

	public static void main(String[] args){
		Student student = new Student();
		student.setLogin("oleglit");
		student.setPass("123456");
		student.setFirstName("Oleg");
		student.setSpec("testSpec");
		
		System.out.println("Student " + student.getFirstName() + " with login " + student.getLogin() + " study on spec " + student.getSpec());
		
	Teacher teacher = new Teacher();
	teacher.setFirstName("Litovka");
	teacher.setLogin("jktu911");
	teacher.setDegree("Doctor of Sciences");
	
	System.out.println("The teacher " + teacher.getFirstName() + " with login " + teacher.getLogin() + " has a degree " + teacher.getDegree() );
	
	Enrollee enrollee = new Enrollee();
	enrollee.setFirstName("Borys");
	enrollee.setLogin("bor");
	enrollee.setCity("Kiev");
	
	System.out.println("The teacher " + teacher.getFirstName() + " teaches the enrollee " + enrollee.getFirstName() + " with login " + enrollee.getLogin() + " who lives in " + enrollee.getCity());
	
	}
}
