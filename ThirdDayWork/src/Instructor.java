
public class Instructor extends User {
	
	
	
	public Instructor(int id, String firstName, String lastName, String email, String course, String password, String position) {
		super(id, firstName, lastName, email, course, password);
		// TODO Auto-generated constructor stub
	}

	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
