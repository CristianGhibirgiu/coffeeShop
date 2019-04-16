
package cafenea;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vali
 */
public class Cafenea {

    /**
     * @param args the command line arguments
     */
    public static Connection con = null;

    public static Connection DBConector() {
        
        
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cafenea", "root", "");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}