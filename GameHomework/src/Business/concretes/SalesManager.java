package Business.concretes;

import Business.abstracts.SalesService;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void BuyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getName() + gamer.getSurname()+" Ýsimli Kullanýcý "
		+ game.getGameName()+" oyunu "+ game.getCost()+ "TL'ye satýn aldý." );
	}

	@Override
	public void ReturnTheGame(Gamer gamer, Game game) {
		System.out.println(gamer.getName()+gamer.getSurname()+" Ýsimli kullanýcý "
		+ game.getGameName()+" oyununu iade etti");
		
	}

	@Override
	public void BuyFromTheCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getName()+" isimli kullanýcý"+ campaign.getName()
		+ " kampanyasýný kullanarak "+ game.getGameName()+"isimli oyunu satýn aldý");
	}

	@Override
	public void SalesCancellation(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" isimli oyun"+ gamer.getName()
		+ " isimli kullanýcý tarafýndan iptal edildi");
		
	}

}
