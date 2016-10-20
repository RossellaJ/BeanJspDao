package it.alfasoft.rossella.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateUtil;
import it.alfasoft.rossella.UtenteBean;

public class UtenteDao {
	 // 1 create
	
	public boolean inserisciUtente(UtenteBean u){
		boolean res=false;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		
		try{
			tx=session.getTransaction();
			

			tx.begin();

			session.persist(u);

			tx.commit();

			res = true;

		} catch (Exception ex) {

			tx.rollback();

		} finally {

			session.close();

		}

		return res;

	}
	//2a read uno
	public boolean readUtenteNomeCognome(String nome, String cognome) {
		boolean res=false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		UtenteBean u = null;
		try {	
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from UtenteBean where nome=:nomeInserito and cognome=:cognomeInserito ");
			query.setString("nomeInserito", nome);
			query.setString("cognomeInserito", cognome);
			u = (UtenteBean) query.uniqueResult();
			if(u!=null){
				res=true;
			}			
			tx.commit();
			res = true;
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();			
		}		
		return res;
	}
	
	public boolean readUtenteUsername(String username) {
		boolean res=false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		UtenteBean u = null;
		try {	
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from UtenteBean where username=:usernameInserito ");
			query.setString("usernameInserito", username);
			u = (UtenteBean) query.uniqueResult();
			if(u!=null){
				res=true;
			}			
			tx.commit();
			res = true;
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();			
		}		
		return res;
	}
		
	//2b read tutti
	
	//3 update
	
	public boolean aggiornaUtente(UtenteBean u) {
		
		boolean res = false;
		
		Session session = HibernateUtil.openSession();
		
		Transaction tx = null;
		
		try {
			
			tx = session.getTransaction();
			
			tx.begin();
			
			session.update(u);
			
			tx.commit();
			
			res = true;
			
		} catch (Exception ex) {
			
			tx.rollback();
			
		} finally {
			
			session.close();
			
		}
		
		return res;
		
	}
	//4 delete
	
		public boolean eliminaVoce(UtenteBean u) {

			boolean res = false;

			Session session = HibernateUtil.openSession();

			Transaction tx = null;

			try {

				tx = session.getTransaction();

				tx.begin();

				session.delete(u);

				tx.commit();

				res = true;

			} catch (Exception ex) {

				tx.rollback();

			} finally {

				session.close();

			}

			return res;

		}



	

}
