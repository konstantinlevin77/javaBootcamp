package homeworks.day4.homework2;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {
	
	public static void main(String[] args) {
		/*
		 * Account +
		 * AccountManager + 
		 * Game +
		 * GameManager (method bazında dependency injection) +
		 * Campaign (Interface)  +
		 * DiscountCampaign +
		 * FreeItemCampaign + 
		 * PresentCampaign + 
		 * CampaignManager +
		 * 
		 * 
		 */
		Account acc1 = testAccountClass();
		testAccountManagerClass(acc1);
		
		Game game1 = testGameClass();
		
		testCampaignManagerClass();
		
		DiscountCampaign campaign1 = new DiscountCampaign();
		
		testGameManagerClass(game1);
		
		testSaleManagerClass(acc1, game1, campaign1);		
		
	}
	
	// In order to prevent code confusion in main, I created those methods
	// They're just for show you how did I check whether they work or not
	// They would not be in a real-world app.
	public static Account testAccountClass(){
		Account acc1 = new Account();
		acc1.setId(1);
		acc1.setFirstName("Mehmet");
		acc1.setLastName("Blabla");
		acc1.setNationalIdentity("12023213124");
		
		Date date = new GregorianCalendar(2021,Calendar.JUNE,12).getTime();
		acc1.setDateOfBirth(date);
		
		System.out.println(acc1.getId());
		System.out.println(acc1.getFirstName());
		System.out.println(acc1.getLastName());
		System.out.println(acc1.getNationalIdentity());
		System.out.println(acc1.getDateOfBirth().toString());
		
		return acc1;
			
	}
	
	public static void testAccountManagerClass(Account account) {
		AccountManager accountManager = new AccountManager();
		accountManager.addAccount(account);
		accountManager.removeAccount(account);
		accountManager.updateAccount(account);
	}
	
	public static Game testGameClass() {
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Stardew Valley");
		System.out.println(game1.getGameName());
		System.out.println(game1.getId());
		
		return game1;
	}
	
	public static void testCampaignManagerClass() {
		DiscountCampaign campaign1 = new DiscountCampaign();
		FreeItemCampaign campaign2 = new FreeItemCampaign();
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		campaignManager.updateCampaign(campaign1);
		campaignManager.addCampaign(campaign2);
		campaignManager.deleteCampaign(campaign2);
		campaignManager.updateCampaign(campaign2);
		
	}
	
	public static void testGameManagerClass(Game game) {
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		gameManager.deleteGame(game);
		gameManager.updateGame(game);
		
	}
	
	public static void testSaleManagerClass(Account account, Game game, Campaign campaign){
		
		SaleManager saleManager = new SaleManager();
		saleManager.buyGame(game, account);
		saleManager.buyGame(game, account, campaign);
	}

}
