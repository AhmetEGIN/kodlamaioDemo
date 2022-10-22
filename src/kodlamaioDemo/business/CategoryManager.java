package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.core.Logging.Loggers;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}



	public void add(Category category) throws Exception {
		if (isCategoryExist(category)) {
			categoryDao.add(category);
			Loggers.runLoggers(loggers, category.getName());
		}
	}
	
	private boolean isCategoryExist(Category category) {
		for(Category _category : categoryDao.get()) {
			if (_category.getName() == category.getName()) {
				return false;
			}
		}
		return true;
	}
}
