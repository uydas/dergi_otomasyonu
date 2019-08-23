/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dergi;
import java.sql.*;
import com.mysql.jdbc.Connection;
import static java.lang.System.out;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class baglantidergi {
     public baglantidergi(){
        
try
        {
                 
            String connectionString = "jdbc:mysql://localhost:3306/dergi";
            Class.forName("com.mysql.jdbc.Driver");
            Connection baglanti = (Connection) DriverManager.getConnection(connectionString,"root","");
     
     
     }
catch(Exception e){
    System.out.println("bağlantı başarısız");
}
    
}
}