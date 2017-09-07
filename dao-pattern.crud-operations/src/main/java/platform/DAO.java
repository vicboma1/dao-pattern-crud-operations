package platform;

import demo.base.Data;
import dsl.*;

/**
 * One DAO class for table or view / CRUD
 */
public interface DAO<T extends Data>  extends Addable<T>, Deletable<T>, Gettable<T>, Listable<T>, Updatable<T> {

}
