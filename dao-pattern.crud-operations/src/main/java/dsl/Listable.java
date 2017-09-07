package dsl;

import demo.base.Data;

import java.util.List;

/** DSL interface to List data**/

public interface Listable<T extends Data>  {
    List<T> getList();
}
