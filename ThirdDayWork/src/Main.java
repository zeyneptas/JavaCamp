
public class Main {

	public static void main(String[] args) {
	
		Student student1 =  new Student(0, null, null, null, null, null, 0);
		
		student1.setId(1);
		student1.setFirstName("Zeynep");
		student1.setLastName("Taş");
		student1.setEmail("zeynep@gmail.com");
		student1.setCourse("Java");
		student1.setPassword("123456");
		student1.setStudentNumber(13012000);
		
		Instructor instructor1 = new Instructor(1, "Engin","Demiroğ" ,"engin@gmail.com", "C#", "123456","Alfa");
		
		
		UserManager userManager = new UserManager();
		userManager.login(instructor1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student1);
		
	}

}
