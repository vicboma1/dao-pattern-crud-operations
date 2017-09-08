package dsl;

import demo.base.Data;

/** DSL interface to delete data **/

public interface Deletable<T extends Data>  {
    T delete(int id);
    void deleteAll();
}
