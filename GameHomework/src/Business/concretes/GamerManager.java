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
			+" isimli kullanıcı sistem tarafından doğrulandı!");
			
		} else {
			System.out.println("Kullanıcı sistem tarafından doğrulanamadı!");

		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullanıcı silindi!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName()+gamer.getSurname()
		+" isimli kullanıcı bilgileri güncellendi!");		
	}

}
