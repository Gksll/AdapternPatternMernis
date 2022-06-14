import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.nationalityId), user.firstName.toUpperCase(),
					user.lastName.toUpperCase(), Integer.parseInt(user.birthYear));
		} catch (NumberFormatException e) {
			System.out.println("format");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("remote");
			e.printStackTrace();
		}
		return result;
		
	}
}
