package platform.bbdd;

import demo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**  Basic Singleton **/

public class Database {

    private static Database _database = create();
    private Connection con;
    private UserListMock userListMock;

    protected static Database create() {
        return new Database();
    }

    public static Database getInstance(){ return _database; }

    Database(){
        userListMock = userListMock.create();
    }

    public void connect() throws Exception {
        if (con != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

        con = DriverManager.getConnection(url, "user", "pass12345");
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        con = null;
    }

    public List<User> getListUser() { return userListMock.getList(); }

}
