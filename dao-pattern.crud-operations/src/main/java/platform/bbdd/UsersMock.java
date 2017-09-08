package platform.bbdd;

import demo.User;
import demo.base.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersMock extends Data {

    private Map<Integer,User> user;

    public static UsersMock create() { return new UsersMock(); }

    UsersMock(){
        user = new HashMap()
            {
                {
                put(0, new User("Johan", "Johan12345", 0));
                put(1, new User("Pepe", "Pepe12345", 1));
                put(2, new User("Rick", "Rick12345", 2));
                put(3, new User("Jork", "Jork12345", 3));
            }};
    }

    public Map<Integer,User> get() {
        return user;
    }
}
