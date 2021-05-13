package Entities.concretes;

import Entities.abstracts.Entity;

public class Sales implements Entity {
	private int id;
	private Gamer gamer;
	private Game game;
	private Campaign campaign;
	
	public Sales() {
		
	}

	public Sales(int id, Gamer gamer, Game game, Campaign campaign) {
		super();
		this.id = id;
		this.gamer = gamer;
		this.game = game;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	

}
