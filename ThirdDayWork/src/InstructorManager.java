
public class InstructorManager extends UserManager {
	
	public void addCourse(User instructorManager) {
		System.out.println(instructorManager.getFirstName() + " added " + instructorManager.getCourse());
	}
	
	public void giveHomework(User instructorManager) {
		System.out.println(instructorManager.getFirstName() + " gived homework from " + instructorManager.getCourse());
	}
	
	
}
