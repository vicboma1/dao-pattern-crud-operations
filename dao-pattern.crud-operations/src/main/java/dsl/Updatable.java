package dsl;

import demo.base.Data;

/** DSL interface to update data **/

public interface Updatable<T extends Data>  {
    T update(T inc);
}
