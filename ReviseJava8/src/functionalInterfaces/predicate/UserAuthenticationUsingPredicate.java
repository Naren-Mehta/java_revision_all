package functionalInterfaces.predicate;

import java.util.function.Predicate;

class User{
	String username;
	String password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

public class UserAuthenticationUsingPredicate {

	public static void main(String[] args) {
		Predicate<User> p = user -> user.username.equals("naren") && user.password.equals("password");
		
		User user = new User("naren", "password1ss");
		
		if(p.test(user)) {
			System.out.println("Authorized");
		}else {
			System.out.println("Username password incorrect");
		}
	}

}
