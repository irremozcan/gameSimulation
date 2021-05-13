package Entities.concretes;

import java.sql.Date;

import Entities.abstracts.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String name;
	private String surname;
	private String natId;
	private int birthOfYear;
	
	public Gamer() {
		
	}
	
	
	public Gamer(int id, String name, String surname, String natId, int birthOfYear) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.natId = natId;
		this.birthOfYear = birthOfYear;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getNatId() {
		return natId;
	}


	public void setNatId(String natId) {
		this.natId = natId;
	}


	public int getBirthOfYear() {
		return birthOfYear;
	}


	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	
	
}
