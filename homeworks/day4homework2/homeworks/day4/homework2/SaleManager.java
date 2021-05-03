package homeworks.day4.homework2;

public class SaleManager {
	
	public void buyGame(Game game,Account account) {
		System.out.println(account.getFirstName()+" adlı kullanıcı "+game.getGameName()+" adlı oyunu satın aldı.");
	}
	
	// Dependency injection
	public void buyGame(Game game,Account account,Campaign campaign) {
		System.out.println(account.getFirstName()+" adlı kullanıcı "+game.getGameName()+" adlı oyunu satın aldı.");
		campaign.applyCampaign();
	}
}
