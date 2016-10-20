package it.alfasoft.rossella.dao;

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
	
	//2b read tutti
	
	//3 update
	
	//4 delete
	

}
