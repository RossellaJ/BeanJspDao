<%@page import="it.alfasoft.rossella.servizi.ServizioRegistrazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="utente" class="it.alfasoft.rossella.UtenteBean" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="utente"/> 
<% 
if(utente.isValid()){
	//l'utente è valido
	
	
	if(){
	//ho trovato utente in DB	
	
	
	}else{
	//non ho trovato utente in DB
		
	}
	
	
}else{
	//l'utente non è valido
}











%>

 