/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dergi.Dergiler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class kullanıcıliste extends veri.baglanti{

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
            jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dergi","root","");
        }
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
  public ArrayList<Kullanicilar> listAllKullanici() throws SQLException {
        ArrayList<Kullanicilar> listem = new ArrayList<>();

        String sql = "SELECT * FROM kullanici";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Kullanicilar user = new Kullanicilar();
            int id = resultSet.getInt("id");
            user.setId(id);
            user.setKullanıcıadı(resultSet.getString("kullaniciadi"));
            user.setSifre(resultSet.getString("sifre"));
            user.setIsim(resultSet.getString("isim"));
            user.setSoyisim(resultSet.getString("soyisim"));
            user.setMail(resultSet.getString("mail"));
            user.setDogumtarihi(resultSet.getString("dogumtarihi"));
            user.setRole(resultSet.getInt("role"));
            listem.add(user);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listem;
    }  } 

