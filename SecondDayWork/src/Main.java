
public class Main {   
	public static void main(String[] args) {
		
	Course course1 = new Course (1,"Programlamaya Giriş");
	Course course2 = new Course(2,"C#");
	Course course3 = new Course(3,"Java & React");
	
	Course[] course = {course1,course2,course3};
	
	for(Course courses : course) {
		System.out.println(courses.name);
	}
	
	CourseManager courseManager = new CourseManager();
	courseManager.add(course3);
	courseManager.delete(course2);
	courseManager.update(course1);
	
	Instructor instructor = new Instructor(1,"Engin","Demiroğ");
	 
	System.out.println(instructor.firstName);
		
	
	}
}

	

	


