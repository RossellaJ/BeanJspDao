package it.alfasoft.rossella;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UtenteBean implements Serializable,DataBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_utente;
	
	private String nome;
	private String cognome;
	private String username;
	
	private String password;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public UtenteBean() {//per far si che non sia null...Tomcat usa questo costruttore
		this.nome="";
		this.cognome="";
		this.username="";
		this.password="";
	
	}
	public UtenteBean(String nome, String cognome, String username,
			String password) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
	}
	@Override
	public boolean isValid() {
		boolean res= false;
		
		if ((!nome.isEmpty()&& nome!=null) &&(!cognome.isEmpty()&& cognome!=null)&&
				(!username.isEmpty()&& username!=null)&&(!password.isEmpty()&& password!=null)
		){
			res=true;
					
		}
		
		return res;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
