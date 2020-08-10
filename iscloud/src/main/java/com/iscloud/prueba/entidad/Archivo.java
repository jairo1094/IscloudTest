package com.iscloud.prueba.entidad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;


public class Archivo {

	String DBSID;
	String DBIP;
	String DBport;
	String DBUserName;
	String DBPassword;
	String PartitionCount;
	String Minconnection;
	String Maxconnection;
	String Path;
	String Email;
	String Ruta;
	

	public Archivo() {}
	
	public Archivo(String DBSID,String DBIP,String DBport,String DBUserName,String DBPassword,String PartitionCount,String Minconnection,String Maxconnection,String Path,String Email) {
	
		this.DBSID=DBSID;
		this.DBIP=DBIP;
		this.DBport=DBport;
		this.DBUserName=DBUserName;
		this.DBPassword=DBPassword;
		this.PartitionCount=PartitionCount;
		this.Minconnection=Minconnection;
		this.Maxconnection=Maxconnection;
		this.Path=Path;
		this.Email=Email;
	}
	
	public Archivo(String DBSID,String DBIP,String DBport,String DBUserName,String DBPassword,String PartitionCount,String Minconnection,String Maxconnection,String Path,String Email, String Ruta) {
		
		this.DBSID=DBSID;
		this.DBIP=DBIP;
		this.DBport=DBport;
		this.DBUserName=DBUserName;
		this.DBPassword=DBPassword;
		this.PartitionCount=PartitionCount;
		this.Minconnection=Minconnection;
		this.Maxconnection=Maxconnection;
		this.Path=Path;
		this.Email=Email;
		this.Ruta=Ruta;
	}
	
	public String getDBSID() {
		return DBSID;
	}
	public void setDBSID(String dBSID) {
		DBSID = dBSID;
	}
	public String getDBIP() {
		return DBIP;
	}
	public void setDBIP(String dBIP) {
		DBIP = dBIP;
	}
	public String getDBport() {
		return DBport;
	}
	public void setDBport(String dBport) {
		DBport = dBport;
	}
	public String getDBUserName() {
		return DBUserName;
	}
	public void setDBUserName(String dBUserName) {
		DBUserName = dBUserName;
	}
	public String getDBPassword() {
		return DBPassword;
	}
	public void setDBPassword(String dBPassword) {
		DBPassword = dBPassword;
	}
	public String getPartitionCount() {
		return PartitionCount;
	}
	public void setPartitionCount(String partitionCount) {
		PartitionCount = partitionCount;
	}
	public String getMinconnection() {
		return Minconnection;
	}
	public void setMinconnection(String minconnection) {
		Minconnection = minconnection;
	}
	public String getMaxconnection() {
		return Maxconnection;
	}
	public void setMaxconnection(String maxconnection) {
		Maxconnection = maxconnection;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRuta() {
		return Ruta;
	}

	public void setRuta(String ruta) {
		Ruta = ruta;
	}
	
	public Archivo leerProperties() throws FileNotFoundException, IOException {
		Properties prop = new Properties();;
		Object obj = new Object();
		InputStream is = null;
		Archivo archivo = new Archivo();
		is= getClass().getClassLoader().getResourceAsStream("config.properties");
		
		try {
		  prop.load(is);
		} catch(IOException ioe) {}
		
		for (Enumeration e = prop.keys(); e.hasMoreElements() ; ) {
		    obj = e.nextElement();
		    if(obj.toString().contains("DBSID")) {archivo.setDBSID(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("DBIP")) {archivo.setDBIP(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("DBport")) {archivo.setDBport(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("DBUserName")) {archivo.setDBUserName(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("DBPassword")) {archivo.setDBPassword(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("PartitionCount")) {archivo.setPartitionCount(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("Minconnection")) {archivo.setMinconnection(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("Maxconnection")) {archivo.setMaxconnection(prop.getProperty(obj.toString()));}
		    else if(obj.toString().contains("Path")) {archivo.setPath(prop.getProperty(obj.toString()));}
		    else {archivo.setEmail(prop.getProperty(obj.toString()));}
		}
		
		return archivo;
	}

}
