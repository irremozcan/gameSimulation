package Business.concretes;

import Business.abstracts.SalesService;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void BuyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getName() + gamer.getSurname()+" �simli Kullan�c� "
		+ game.getGameName()+" oyunu "+ game.getCost()+ "TL'ye sat�n ald�." );
	}

	@Override
	public void ReturnTheGame(Gamer gamer, Game game) {
		System.out.println(gamer.getName()+gamer.getSurname()+" �simli kullan�c� "
		+ game.getGameName()+" oyununu iade etti");
		
	}

	@Override
	public void BuyFromTheCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getName()+" isimli kullan�c�"+ campaign.getName()
		+ " kampanyas�n� kullanarak "+ game.getGameName()+"isimli oyunu sat�n ald�");
	}

	@Override
	public void SalesCancellation(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" isimli oyun"+ gamer.getName()
		+ " isimli kullan�c� taraf�ndan iptal edildi");
		
	}

}
