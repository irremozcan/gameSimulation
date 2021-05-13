package Business.concretes;

import Business.abstracts.ConfirmationService;
import Business.abstracts.GamerService;
import Entities.concretes.Gamer;

public class GamerManager implements GamerService {
	
	private ConfirmationService confirmationService;
	public GamerManager(ConfirmationService confirmationService) {
		super();
		this.confirmationService=confirmationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (confirmationService.confirmationRealPerson(gamer)) {
			System.out.println(gamer.getName()+gamer.getSurname()
			+" isimli kullan�c� sistem taraf�ndan do�ruland�!");
			
		} else {
			System.out.println("Kullan�c� sistem taraf�ndan do�rulanamad�!");

		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullan�c� silindi!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullan�c� bilgileri g�ncellendi!");		
	}

}
