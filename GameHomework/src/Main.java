import Adapters.MerniceAdaptersServices;
import Business.concretes.CampaignManager;
import Business.concretes.GameManager;
import Business.concretes.GamerManager;
import Business.concretes.SalesManager;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class Main {
	public static void main(String[] args) {
		
		// -------------------Oyuncu Ýþlemleri----------------
		
		GamerManager gamerManager= new GamerManager(new MerniceAdaptersServices());
		Gamer gamer1 = new Gamer(1, "Ýrem", "ÖZCAN", "12345678901", 2000);
		
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1);
		
		// -------------------Oyun Ýþlemleri----------------
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, "GTA", 150);
		Game game2 = new Game(2, "SÝMS", 120);
		Game game3 = new Game(3, "VALORANT", 130);
		
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		
		// -------------------Kampanya----------------
		
		CampaignManager campaign = new CampaignManager();
		Campaign campaign1 = new Campaign(1,"Ramazan Kampanyasý");
		campaign.add(campaign1);
		campaign.delete(campaign1);
		campaign.update(campaign1);
		
		// -------------------Satýþlar----------------
		SalesManager salesManager = new SalesManager();
		salesManager.BuyGame(gamer1, game2);
		salesManager.BuyFromTheCampaign(gamer1, game3, campaign1);
		salesManager.ReturnTheGame(gamer1, game1);
		salesManager.SalesCancellation(gamer1, game2);
		
		
		
		
	}
	

}
