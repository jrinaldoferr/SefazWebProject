package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
      public static Connection faz_Conexao() throws SQLException {
    	  
    	  try {
    		  
    		  Class.forName("com.mysql.jdbc.Driver"); 
    		  
    	  	  return DriverManager.getConnection("jdbc:mysql://localhost/desafiosefaz","root","");

    	  } catch (ClassNotFoundException e) {
    		
    		  throw new SQLException(e.getException());
    		  
    	  }
	
      }
}