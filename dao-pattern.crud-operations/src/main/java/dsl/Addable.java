package dsl;

import demo.base.Data;

/** DSL interface to add data **/

public interface Addable<T extends Data> {
    Boolean add(T incrementable);
}
