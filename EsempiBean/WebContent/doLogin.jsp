<%@page import="it.alfasoft.rossella.servizi.ServizioRegistrazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="utente" class="it.alfasoft.rossella.UtenteBean" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="utente"/>
<% 
ServizioRegistrazione sr = new ServizioRegistrazione();
				if(utente.isValid()){
					//l'utente � valido
						String passDaCodificare = utente.getPassword();
						String passCodificata= sr.convertiPass(passDaCodificare);
		
						utente.setPassword(passCodificata);
						if(sr.cercaUtenteUsernamePassword(utente.getUsername(),utente.getPassword())){
					//ho trovato utente in DB con Uasername e Passord	
				%>
						<jsp:forward page="Welcome.jsp"></jsp:forward>
				<% 
						}else{
					//non ho trovato utente in DB
				%>
						<jsp:forward page="Login.jsp"></jsp:forward>
				<% 	
						}
				}else{
					//l'utente non � valido
				
				%>
				<jsp:forward page="Login.jsp"></jsp:forward>
				<% 
				}
				%>
