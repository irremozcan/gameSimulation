package Business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public interface SalesService {
	void BuyGame(Gamer gamer, Game game);
	void ReturnTheGame(Gamer gamer, Game game);
	void BuyFromTheCampaign(Gamer gamer, Game game, Campaign campaign);
	void SalesCancellation(Gamer gamer, Game game);

}
