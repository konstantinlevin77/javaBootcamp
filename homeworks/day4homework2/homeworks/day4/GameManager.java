package homeworks.day4;

public class GameManager {
	
	public void addGame(Game game) {
		System.out.println("Oyun sisteme eklendi: "+game.getGameName());
	}
	
	public void deleteGame(Game game) {
		System.out.println("Oyun sistemden silindi: "+game.getGameName());
	}
	
	public void updateGame(Game game) {
		System.out.println("Oyun sistemde güncellendi: "+game.getGameName());
	}
	
	public void buyGame(Game game,Account account) {
		System.out.println(account.getFirstName()+" adlı kullanıcı "+game.getGameName()+" adlı oyunu satın aldı.");
	}
	
	// Dependency injection
	public void buyGame(Game game,Account account,Campaign campaign) {
		System.out.println(account.getFirstName()+" adlı kullanıcı "+game.getGameName()+" adlı oyunu satın aldı.");
		campaign.applyCampaign();
	}
	
	
}
