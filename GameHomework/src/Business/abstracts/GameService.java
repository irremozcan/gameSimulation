package Business.abstracts;

import Entities.concretes.Game;

public interface GameService {
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);

}
