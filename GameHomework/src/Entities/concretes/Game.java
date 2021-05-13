package Entities.concretes;

import Entities.abstracts.Entity;

public class Game implements Entity {
	
	private int id;
	private String gameName;
	private double cost;

	public Game(int id, String gameName, double cost) {
		super();
		this.id=id;
		this.gameName = gameName;
		this.cost=cost;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
