
package SQLManager;

import java.sql.*;

public class Connector {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bnb","root","argopuro48"); 
            return con;
        }
        catch(Exception e) {
            return null;
        }
    }
}
