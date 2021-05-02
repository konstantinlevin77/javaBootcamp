package homeworks.day4;

public class CampaignManager {
	
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi: "+campaign);
		
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi: "+campaign);
	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi: "+campaign);
	}

}
