package Business.concretes;

import Business.abstracts.ConfirmationService;
import Entities.concretes.Gamer;

public class ConfirmationManager implements ConfirmationService {

	@Override
	public boolean confirmationRealPerson(Gamer gamer) {
			return true;
		}
		
	}


