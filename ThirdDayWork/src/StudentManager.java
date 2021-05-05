
public class StudentManager extends UserManager{
	public void submitHomework(User studentManager) {
		System.out.println(studentManager.getFirstName() + " submited homework " + studentManager.getCourse());
	}
	
	public void joinCourse(User studentManager) {
		System.out.println(studentManager.getFirstName() + " joined to  " + studentManager.getCourse());
	}
}
