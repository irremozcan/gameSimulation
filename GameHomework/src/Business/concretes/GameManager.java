package Business.concretes;

import Business.abstracts.GameService;
import Entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " isimli oyun eklendi!");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " isimli oyun silindi!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " isimli oyun gŁncellendi!");
		
	}

}
