package com.Utility.BIATNET_V1;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Properties;


public class Utility {
	private static Properties prop = new Properties();
	private static String userOFS;
	private static String pwdOFS;
	static {
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/Servlets/BIATNET_V1/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initOFSParam(){
		InvocationSingleton invocator = new InvocationSingleton();
		String tws_ofsInfo;
		try {
			tws_ofsInfo = invocator.getOfsUserInfos("CHQ");
			String[] splits = tws_ofsInfo.split(",");
			String[] headers = splits[2].split("\"");
			String userOfs = headers[3];
			String pwdOfs = headers[7];
			userOFS = userOfs.trim();
			pwdOFS = pwdOfs.trim();			
			
		} catch (Exception e) {
			throw new RuntimeException("Echec de récupération des données de T24");
		}
	}
	public static String getParameter(String key){
		return prop.getProperty(key);
	}
	public static String getUserOFS() {
		if(userOFS == null)
			initOFSParam();
		return userOFS;
	}
	
	public static String getPwdOFS() {
		if(pwdOFS == null)
			initOFSParam();
		return pwdOFS;
	}
	
	
}
