package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.TeacherManager;
import kodlamaioDemo.core.Logging.DatabaseLogger;
import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.core.Logging.MailLogger;
import kodlamaioDemo.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioDemo.dataAccess.hibernate.HibernateTeacherDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new MailLogger(), new DatabaseLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
		Course course1 = new Course(3, 1, 1, "Java2", 10);
		courseManager.add(course1);
		Teacher teacher1 = new Teacher(3, "Mustafa Murat Coþkun");
		teacherManager.add(teacher1);
		Category category1 = new Category(3, "Senior");
		categoryManager.add(category1);
		
		
		
		

	}

}
