package utils;

//Configuraciones necesarias para la Base de Datos de MySql

public class DBUtils {

	//Para evitar la advertencia SSL, lo ponemos a false.	
	public static final String URL = "jdbc:mysql://localhost:3306/empresa?useSSL=false";

	// DRIVER:
	// <groupId>mysql</groupId>
	// <artifactId>mysql-connector-java</artifactId>
	// <version>5.1.48</version>

	// Nombre y Pass de acceso a la Base de Datos
	public static final String USER = "root";
	public static final String PASS = "elorrieta";
}