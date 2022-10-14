package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port/db adını
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        Connection connection = DriverManager.getConnection(url,username,password); // DB işe connection
        Statement statement = connection.createStatement(); // sorguları çalıştırmak için page açıldı.
        ResultSet result = statement.executeQuery("select * from actor" ); // sorgu sonucu oluştu henüz DB de bekliyor

        result.next();

        String firstName = result.getString("first_name");
        String lastName = result.getString("last_name");

        System.out.println("firstName : " + firstName + " - lastName : " + lastName);

        result.next();

        firstName = result.getString("first_name");
        lastName = result.getString("last_name");

        System.out.println("firstName : " + firstName + " - lastName : " + lastName);


    }
}
