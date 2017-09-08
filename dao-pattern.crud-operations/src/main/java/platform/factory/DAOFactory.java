package platform.factory;

import platform.UserDAO;

public abstract class DAOFactory {

     public static UserDAO createUserDAO() { return UserDAO.create(); }
}
