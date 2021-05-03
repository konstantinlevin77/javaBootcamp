package homeworks.day4.homework2;

public class Game {
	
	private int id;
	private String gameName;
	
	public Game() {
		
	}
	
	public Game(int id,String gameName) {
		this.id = id;
		this.gameName = gameName;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGameName() {
		return this.gameName;
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

}
