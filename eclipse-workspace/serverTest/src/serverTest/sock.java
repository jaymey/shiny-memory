package serverTest;
import java.sql.*;

public class sock {
    public static void main(String[] args) {
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://html-trojan-rr.local/at?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST","newuser","////");
    		Statement myStmt = myConn.createStatement();
    		String sql = "insert into Audits"
    				+ " (id, last_name, first_name, email)"
    				+ "values (1, 'David', 'Harris', 'H.david@gmail.com');";
    		myStmt.executeUpdate(sql);
    		System.out.println("Insert Complete");
    	}
    	catch (Exception exc) {
    		exc.printStackTrace();
    	}
    }
}