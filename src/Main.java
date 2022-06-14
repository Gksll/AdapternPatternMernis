

public class Main {

	public static void main(String[] args) {
		User user = new User();
		
		user.firstName="Göksel";
		user.birthYear="1994";
		user.nationalityId="21040181962";
		user.lastName="Doğan";

        UserManager userManager = new UserManager(new MernisServiceAdapter());
        
        userManager.Add(user);

	}

}
