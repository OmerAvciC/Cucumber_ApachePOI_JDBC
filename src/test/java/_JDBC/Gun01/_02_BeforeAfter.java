package _JDBC.Gun01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

    private static Connection connection;
    private static Statement statement;

    @BeforeTest
    public void DBConnectionOpen(){
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port/db adını
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(url,username,password); // DB işe connection
            statement = connection.createStatement(); // sorguları çalıştırmak için page açıldı.
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @AfterTest
    public void DBConnectionClose(){

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() throws SQLException {
        ResultSet result = statement.executeQuery("select * from language" ); // sorgu sonucu oluştu henüz DB de bekliyor

        result.next();
        String name = result.getString("name");
        System.out.println("Name : " + name);
        result.next();
        name = result.getString("name");
        System.out.println("Name : " + name);
        result.next();
        name = result.getString("name");
        System.out.println("Name : " + name);


    }

    @Test
    public void test2() throws SQLException {

        ResultSet result = statement.executeQuery("select * from language" ); // sorgu sonucu oluştu henüz DB de bekliyor

        result.next();

        String name = result.getString(2);
        System.out.println("Name : " + name);

        result.next();

        name = result.getString(2);
        System.out.println("Name : " + name);

        result.next();

        name = result.getString(2);
        System.out.println("Name : " + name);

        result.previous(); // bulunduğu yerden bir önceki satıra

        name = result.getString(2);
        System.out.println("Name : " + name);
    }
}
