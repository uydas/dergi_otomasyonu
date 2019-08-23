/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import com.mysql.jdbc.Connection;
import static java.lang.System.out;
import java.sql.DriverManager;


/**
 *
 * @author Lenovo
 */
public class baglanti {
    public Connection conn=null;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public void connectionOpen() {
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/dergi";
            Class.forName(myDriver);
            setConn((Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dergi?useUnicode=true&characterEncoding=UTF-8", "root", ""));
          
            System.out.println("bağlantı başarı ile açıldı");
        } catch (Exception e) {
            System.out.println("bağlantı başarısız");
           
        }
    }
    
    
    public void connectionClose(){
        try{
            if(getConn()!=null){
                setConn(null);
                System.out.println("bağlantı kapatıldı");
            }
        }
        catch(Exception e){
            System.out.println("bağlantı kapatılırken hata");
        }
    }                      
}