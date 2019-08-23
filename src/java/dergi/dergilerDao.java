/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dergi;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import kod.control;
import veri.baglanti;

/**
 *
 * @author Lenovo
 */
public class dergilerDao extends veri.baglanti {

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

    public boolean insertdergi(HttpServletRequest request, int kullaniciid) throws SQLException {

        boolean durum = false;
        control kontrol = new control();
        String dergiadı = request.getParameter("dergiadi");
        String issn = request.getParameter("issn");
        String alan = request.getParameter("alan");
        String editor = request.getParameter("editor");
        String ilkyayın = request.getParameter("ilkyayin");
        String sonyayın = request.getParameter("sonyayin");
        int kulid = kullaniciid;

        System.out.println("request : " + request.toString());
        System.out.println("dergiadı : " + dergiadı);
        System.out.println("issn : " + issn);
        System.out.println("alan : " + alan);
        System.out.println("editor : " + editor);
        System.out.println("ilkyayın : " + ilkyayın);
        System.out.println("sonyayın : " + sonyayın);
        System.out.println("--------------------------------------------- : " );

        try {
            connectionOpen();

            String sql = "insert into dergiler (dergiadi,issn,alan,editor,ilkyayın,sonyayın,kullaniciid) values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, dergiadı);
            statement.setString(2, issn);
            statement.setString(3, alan);
            statement.setString(4, editor);
            statement.setString(5, kontrol.tarih(ilkyayın));
            statement.setString(6, kontrol.tarih(sonyayın));
            statement.setInt(7, kulid);

            statement.executeUpdate();
            durum = true;
        } catch (SQLException sql) {
            request.setAttribute("error", sql);
            System.out.println(sql);
            durum = false;
        } catch (Exception ex) {
            request.setAttribute("error", ex);
            System.out.println("hata : "+ex);
            durum = false;
        } finally {
            System.out.println(durum);
            connectionClose();
            return durum;

        }
    }

    public ArrayList<Dergiler> listAlldergiler() throws SQLException {
        ArrayList<Dergiler> list = new ArrayList<>();

        String sql = "SELECT * FROM dergiler";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Dergiler user = new Dergiler();
            int id = resultSet.getInt("id");
            user.setDergiadi(resultSet.getString("dergiadi"));
            user.setIssn(resultSet.getString("issn"));
            user.setAlan(resultSet.getString("alan"));
            user.setEditor(resultSet.getString("editor"));
            user.setIlkyayın(resultSet.getDate("ilkyayın"));
            user.setSonyayın(resultSet.getDate("sonyayın"));

            list.add(user);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return list;
    }

    public boolean deleteDergi(Dergiler dergiler) throws SQLException {
        String sql = "DELETE FROM dergiler where id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, dergiler.getId());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateDergi(Dergiler Dergiler) throws SQLException {
        String sql = "UPDATE dergiler SET kullanciadi = ?, issn = ?, alan = ?,editor = ?,ilkyayın = ?, sonyayın = ?";
        sql += " WHERE id = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, Dergiler.getDergiadi());
        statement.setString(2, Dergiler.getIssn());
        statement.setString(3, Dergiler.getAlan());
        statement.setString(4, Dergiler.getEditor());
        statement.setDate(5, (Date) Dergiler.getIlkyayın());
        statement.setDate(6, (Date) Dergiler.getSonyayın());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

    public Dergiler getdergiler(int id) throws SQLException {
        Dergiler dergiler = null;
        String sql = "SELECT * FROM dergiler WHERE id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {

            id = resultSet.getInt("id");
            String dergiadi = resultSet.getString("dergiadi");
            String issn = resultSet.getString("issn");
            String alan = resultSet.getString("alan");
            String editor = resultSet.getString("editor");
            Date ilkyayın = resultSet.getDate("ilkyayın");
            Date sonyayın = resultSet.getDate("sonyayın");

        }

        resultSet.close();
        statement.close();

        return dergiler;
    }
}
