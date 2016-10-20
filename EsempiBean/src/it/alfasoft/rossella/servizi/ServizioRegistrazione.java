package it.alfasoft.rossella.servizi;

import utility.CodificationOfPassword;
import it.alfasoft.rossella.UtenteBean;
import it.alfasoft.rossella.dao.UtenteDao;

//1
public class ServizioRegistrazione {
	
	private UtenteDao uDao = new UtenteDao();

	public boolean cercaUtenteNomeCognome(String nome,String cognome){
		
		return uDao.readUtenteNomeCognome(nome, cognome);
				
	}
	
	public boolean cercaUtenteUsername (String username){
		return uDao.readUtenteUsername(username);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean registraUtente(UtenteBean u) {

		UtenteDao uDao = new UtenteDao();

		return uDao.inserisciUtente(u);

	}
//2
	public String convertiPass(String pass) {

		return CodificationOfPassword.codificatePass(pass);

	}
//
	

	
	
}