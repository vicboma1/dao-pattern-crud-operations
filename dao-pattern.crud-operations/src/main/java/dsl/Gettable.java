package dsl;

import demo.base.Data;

/** DSL interface to get data **/

public interface Gettable<T extends Data> {
    T get(int id);
}
