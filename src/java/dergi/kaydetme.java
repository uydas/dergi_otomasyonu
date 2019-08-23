/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dergi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import kod.control;

/**
 *
 * @author Lenovo
 */
public class kaydetme extends veri.baglanti {
    

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public void dergilerDao1(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }

    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("bağlanti sağlandi");
            } catch (ClassNotFoundException e) {
                
                System.out.println("bağlantı başarısız");
            }
            jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dergi", "root", "");
        }
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }

    public boolean insertkullanici (HttpServletRequest request) throws SQLException {
       
         boolean durum = false;
        control kontrol = new control();
        String kullanıcıadı = request.getParameter("kullaniciadi");
        String sifre = request.getParameter("sifre");
        String isim = request.getParameter("isim");
        String soyisim = request.getParameter("soyisim");
        String mail = request.getParameter("mail");
        String dogumtarihi = kontrol.tarih(request.getParameter("dogumtarihi"));
        int role =0;
        try {
           connectionOpen();
            System.out.println(kullanıcıadı+"  "+sifre+"     "+isim+"      "+soyisim+"     "+mail+"      "+dogumtarihi);

            String sql = "insert into kullanici (kullaniciadi,sifre,isim,soyisim,mail,dogumtarihi,role) values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, kullanıcıadı);
            statement.setString(2, sifre);
            statement.setString(3, isim);
            statement.setString(4, soyisim);
            statement.setString(5, mail);
            statement.setString(6, dogumtarihi);
            statement.setInt(7, role);
            
            statement.executeUpdate();
            
}
                   
        
catch(SQLException sql)
{
request.setAttribute("error", sql);
System.out.println(sql);
durum=false;
}
       
        
       finally{
               System.out.println(durum);
               connectionClose();
           return durum;
           
       }
    }

   
    }

