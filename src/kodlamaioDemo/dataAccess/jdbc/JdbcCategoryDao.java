package kodlamaioDemo.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	private List<Category> categories;

	public JdbcCategoryDao() {
		categories = new ArrayList<>();
		categories.add(new Category(1, "Yazýlýma Giriþ"));
		categories.add(new Category(2, "Java"));
	}

	@Override
	public void add(Category entity) {
		categories.add(entity);
		System.out.println("Jdbc ile eklendi" + entity.getName());

	}

	@Override
	public List<Category> get() {
		return categories;
	}

}
