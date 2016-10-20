<%@page import="it.alfasoft.rossella.servizi.ServizioRegistrazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<jsp:useBean id ="utente" class ="it.alfasoft.rossella.UtenteBean" scope="request"> </jsp:useBean>

<jsp:setProperty property="*" name="utente"/> 
<%// * vuol dire setta tutto!
	ServizioRegistrazione sr = new ServizioRegistrazione ();

if(utente.isValid()==true){
	//l 'utente è valido
	if(sr.cercaUtenteNomeCognome(utente.getNome(),utente.getCognome())){
	//l'utente non esiste nel database secondo nome e cognome
		if(sr.cercaUtenteUsername(utente.getUsername())){
		//username è dispoinibile quindi Codifico password, Registro su database con dao, Rimando a ragistrato con succ.jsp
		String passDaCodificare = utente.getPassword();
		String passCodificata= sr.convertiPass(passDaCodificare);
		
		utente.setPassword(passCodificata);
		sr.registraUtente(utente);
		//RIMANDO AL JSP REGISTRAZIONE CON SUCCESSO
	%>
	
	<jsp:forward page="RegistrazioneconSuccesso.jsp"/>
	
	<%
		}else{
		//username non disponibile
	%>	
	<jsp:forward page="formRegistrazione.jsp"></jsp:forward>
	<% 	
		}
	
	}else{
		//l'utente esiste
		%>	
		<jsp:forward page="formRegistrazione.jsp"></jsp:forward>
		<% 	
		
	}
}else{
	//l' utente non è valido
	%>	
	<jsp:forward page="formRegistrazione.jsp"></jsp:forward>
	<% 	
}
	
%>	
	
	
	
	
	
	
	
	
	
	
	












