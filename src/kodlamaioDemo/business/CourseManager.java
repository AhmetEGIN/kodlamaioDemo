package kodlamaioDemo.business;

import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	Course[] courses;
	Logger[] loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		courses = new Course[] {
				new Course(1, 1, 1, "Java",200),
				new Course(2, 2, 1, "Yazýlýma Giriþ",50)
		};
	}
	
	public void add(Course course) throws Exception {
		if (isCourseExist(course) && isPriceGreaterThenZero(course)) {
			courseDao.add(course);
			for(Logger logger : loggers) {
				logger.log(course.getName());
			}
		} 
	}
	
	// business-Codes
	private boolean isCourseExist(Course course) throws Exception {
		for(Course _course : courses) {
			if (_course.getName().equals(course.getName())) {
				throw new Exception("Bu isimde bir kurs zaten mevcut");
			}
		}
		return true;
	}
	
	private boolean isPriceGreaterThenZero(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Kurs fiyatý 0 dan küçük olamaz");
		} else {
			return true;
		}
	}
	
}
