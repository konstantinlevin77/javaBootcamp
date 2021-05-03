package homeworks.day4.homework2;

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
	
	
	
	
}
