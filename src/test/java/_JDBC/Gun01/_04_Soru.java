package _JDBC.Gun01;

import _JDBC.Gun02.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {

    ResultSet rs;
    @Test
    public void test01() throws SQLException {

        rs = statement.executeQuery("select * from country");
        rs.first();
        do {
            rs.getRow();
            String country = rs.getString("country");
            System.out.println("RoW : " + country);
        } while (rs.next());

    }
    @Test
    public void test02() throws SQLException {

        int cnt = 0;
        rs = statement.executeQuery("select * from country");
        while (rs.next()){
            System.out.println(rs.getString("country"));
            cnt++;
        }
        System.out.println("cnt : " + cnt);

    }
    @Test
    public void test03() throws SQLException {

        rs = statement.executeQuery("select * from city");

        int cnt = 0;
        while (rs.relative(1)){
            System.out.println(rs.getString(2));
            cnt++;
        }
        System.out.println("CNT : " + cnt);
    }
    @Test
    public void test04() throws SQLException {

        rs = statement.executeQuery("select * from city");

        int cnt = 1;
        while (rs.absolute(cnt)){
            System.out.println(rs.getString("city"));
            cnt++;
        }
        System.out.println("COUNT : " + (cnt-1));

    }
}