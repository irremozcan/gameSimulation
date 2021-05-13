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
			+" isimli kullanýcý sistem tarafýndan doðrulandý!");
			
		} else {
			System.out.println("Kullanýcý sistem tarafýndan doðrulanamadý!");

		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullanýcý silindi!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullanýcý bilgileri güncellendi!");		
	}

}
