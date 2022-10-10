package kodlamaioDemo.core.dataAccess;

import java.util.List;

public interface EntityRepository<T> {
	void add(T entity);
	List<T> get();
}
