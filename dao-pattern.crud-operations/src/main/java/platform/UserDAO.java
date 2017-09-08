package platform;

import demo.User;
import platform.bbdd.Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserDAO implements DAO<User> {


    public static UserDAO create() {
        return new UserDAO();
    }

    UserDAO(){

    }

    public Integer size() {
        return getUsers().size(); }

    @Override
    public User add(User item){
        return getUsers().put(item.getId(),item);
    }

    @Override
    public List<User> addAll(List<User> dataList) {
        List<User> res = new ArrayList();

        dataList.stream().forEach(x -> {
            res.add( this.add((x)) );
        });

        return res;
    }

    @Override
    public User get(int id) {
        final User user = getUsers().get(id);
        return user;
    }

    @Override
    public List<User> getList(){
        return getUsers().values().stream().collect(Collectors.toList());
    }

    @Override
    public User update(User item){
        return getUsers().put(item.getId(),item);
    }

    @Override
    public User delete(int id) {
        return getUsers().remove(id);
    }

    @Override
    public void deleteAll() {
        getUsers().clear();
    }

    private Database getDatabase(){
        return Database.getInstance();
    }

    private Map<Integer,User> getUsers() { return getDatabase().getUsers(); }
}
