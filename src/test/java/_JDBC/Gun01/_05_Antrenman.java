package _JDBC.Gun01;

import _JDBC.Gun02.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_Antrenman extends JDBCParent {

    @Test
    public void test01() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from country");

//        rs.absolute(10);
//
//        String actor = rs.getString("country");
//
//        System.out.println(actor);

        rs.next();
        rs.getRow();
        String actor01 = rs.getString("country");
        System.out.println(actor01);
    }
}
