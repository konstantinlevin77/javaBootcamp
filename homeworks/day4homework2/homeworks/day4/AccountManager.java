package homeworks.day4;

public class AccountManager {
	
	public void addAccount(Account account) {
		System.out.println(account.getId()+" ID'li hesap eklendi.");
	}
	
	public void removeAccount(Account account) {
		System.out.println(account.getId()+" ID'li hesap silindi");
	}
	
	public void updateAccount(Account account) {
		System.out.println(account.getId() + "ID'li hesap güncellendi");
	}

}
