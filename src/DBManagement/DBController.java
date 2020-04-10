package DBManagement;
/*
 * Created by: Artem Sliusarenko
 *
 * Date: 10.04.2020
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DBController {
    private final static String db_name = "stock_info_java_swing";
    Connection conn = null;



    public DBController() {
        dbConnection();

        terminateConnection();
    }


    // db_connection connects to the "db_name" database
    private void dbConnection() {
        System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/stock_info_java_swing?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
            String username = "root";
            String password = "HackMeNoMySQL13";
            Class.forName(driver);

            conn = DriverManager.getConnection(url, username, password);
            System.out.println ("\nDatabase Connection Established...");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void terminateConnection(){
        try {
            System.out.println("\n***** Let terminate the Connection *****");
            conn.close();
            System.out.println ("\nDatabase connection terminated...");
        }
        catch (Exception e){
            System.out.println("Error in connection termination!");
        }
    }

    // table_exist check whether table with the given name exists
    private void table_exist(String title){

    }

    private void create_table(String title){

    }


}
