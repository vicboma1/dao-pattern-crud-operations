package platform.bbdd;

import demo.User;
import demo.base.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserListMock extends Data {

    private List<User> user;

    public static UserListMock create() { return new UserListMock(); }

    UserListMock(){

        user =  new ArrayList<User>() {
            {
                add(new User("Johan", "Johan12345", 0));
                add(new User("Pepe", "Pepe12345", 1));
                add(new User("Rick", "Rick12345", 2));
                add(new User("Jork", "Jork12345", 3));
            }};
    }

    public List<User> getList() {
        return user;
    }
}
