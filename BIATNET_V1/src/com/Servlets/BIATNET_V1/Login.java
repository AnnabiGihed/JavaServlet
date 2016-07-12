package com.Servlets.BIATNET_V1;

import com.biat.HIDauth.HIDauth;
import com.aspace.ftress.interfaces70.ftress.DTO.AuthenticationResponse;

public class Login 
{
	String identifiant="identifiant";
	String password="password";
	Boolean flag;
	//String identifiant = request.getParameter("identifiant1");
	//String password = request.getParameter("password1");
	public Boolean Verifiy_Connection()
	{
		if (identifiant != null && password != null) 
		{
			String user = "identifiant";
			String pass = "password";
			try 
			{
				HIDauth hIDauth = null;
				String current = new java.io.File(".").getCanonicalPath();
				current = current + "/";
				System.out.println("auth " + current);
				hIDauth = new HIDauth("auth_mb.conf");
				if (hIDauth.authUP(user, pass).getResponse() == AuthenticationResponse.RESPONSE_AUTHENTICATION_SUCCEEDED) 
				{
					System.out.println("----------DEBUG-----------  OK User: " + user + " pass: " + pass + "\n");
				} 
				else 
				{
					flag = false;
					System.out.println("----------DEBUG-----------  FALSE User: " + user + " pass: " + pass + "\n");
				}
			} 
			catch (Exception e) 
			{
				//request = null;
				System.out.println("ahmed  --------------exception : " + e.getMessage());
				e.printStackTrace();
				flag = false;
			}
		}
		else
		{
			flag = false;
		}
		return flag;
	}
}
