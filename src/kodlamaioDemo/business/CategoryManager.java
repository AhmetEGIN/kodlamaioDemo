package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		categories = new ArrayList<>();
		categories.add(new Category(1, "Yazýlýma Giriþ"));
		categories.add(new Category(2, "Java"));
	}



	public void add(Category category) throws Exception {
		if (categoryDao.getCategory(category)) {
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		}
	}
}
