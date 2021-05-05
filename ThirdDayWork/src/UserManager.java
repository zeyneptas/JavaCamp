
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " has logged in.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " has logged out.");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " has registered.");
	}
	
	public void updateMyInformation(User user) {
		System.out.println(user.getFirstName() + " has saved the user information.");
	}
}

