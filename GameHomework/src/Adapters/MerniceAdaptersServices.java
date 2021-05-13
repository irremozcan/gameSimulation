package Adapters;

import java.rmi.RemoteException;

import Business.abstracts.ConfirmationService;
import Entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceAdaptersServices implements ConfirmationService {

	@Override
	public boolean confirmationRealPerson(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNatId()),
					gamer.getName().toUpperCase(),
					gamer.getSurname().toUpperCase(), 
					gamer.getBirthOfYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
	}


