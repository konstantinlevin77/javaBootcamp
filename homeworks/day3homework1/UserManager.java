package homeworks;

public class UserManager {
	
	void add(User user) {
		System.out.println("Kullanıcı eklendi, id: "+user.getId());
		
	}
	
	void remove(User user) {
		System.out.println("Kullanıcı silindi, id"+user.getId());
	}
	
	
}
