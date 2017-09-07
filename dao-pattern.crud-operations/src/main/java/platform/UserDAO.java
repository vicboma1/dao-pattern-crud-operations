package platform;

import demo.User;
import platform.bbdd.Database;

import java.util.List;

public class UserDAO implements DAO<User> {


    public static UserDAO create() {
        return new UserDAO();
    }

    UserDAO(){

    }

    @Override
    public Boolean add(User item){
        return getDatabase().getListUser().add(item);
    }

    @Override
    public User get(int id){
        return getDatabase().getListUser().get(id);
    }

    @Override
    public List<User> getList(){
        return getDatabase().getListUser();
    }

    @Override
    public User update(User item){
        User user = item;
        final int index =  getDatabase().getListUser().lastIndexOf(item);
        if( index == -1 )
             getDatabase().getListUser().add(item);
        else
            user = getDatabase().getListUser().set(index,item);

        return user;
    }

    @Override
    public User delete(int id) {
        return getDatabase().getListUser().remove(id);
    }

    private Database getDatabase(){
        return Database.getInstance();
    }
}
