<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<jsp:useBean id ="utente" class ="it.alfasoft.rossella.UtenteBean" scope="request"> </jsp:useBean>

<jsp:setProperty property="*" name="utente"/>
<%

if(utente.isValid()==true){
	//allora registrazione è stata effettuata con successo
	%>
	<jsp:forward page="RegistrazioneconSuccesso.jsp"></jsp:forward>
	
	<% 
}else{
//torna alla pagina login	

 

%>
<jsp:forward page="formRegistrazione.jsp"></jsp:forward>

<%} %>










