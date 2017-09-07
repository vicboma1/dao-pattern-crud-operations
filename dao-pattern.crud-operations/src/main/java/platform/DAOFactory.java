package platform;

public abstract class DAOFactory {

     public static UserDAO createUserDAO() { return UserDAO.create(); }
}
