

public class UserManager  extends BaseUserService {

	private UserCheckService userCheckService;
	
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}


	@Override
	public void Add(User user) {
		if (userCheckService.CheckIfRealPerson(user)) {
			super.Add(user);
		} else {
			System.out.println("Hata");
		}
		
	}

	
	
	
	

	
}
