package kodlamaioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.dataAccess.hibernate.HibernateEntityRepositoryBase;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao extends HibernateEntityRepositoryBase<Category> implements CategoryDao {
	private List<Category> categories;

	public HibernateCategoryDao() {
		categories = new ArrayList<>();
		categories.add(new Category(1, "Yazýlýma Giriþ"));
		categories.add(new Category(2, "Java"));
		super.entities = categories;
	}

}
