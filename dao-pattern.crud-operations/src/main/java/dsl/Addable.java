package dsl;

import demo.User;
import demo.base.Data;

import java.util.List;

/** DSL interface to add data **/

public interface Addable<T extends Data> {
    User add(T data);
    List<User> addAll(List<T> dataList);
}
