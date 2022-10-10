package kodlamaioDemo.business;

import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	Logger[] loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

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
		for(Course _course : courseDao.get()) {
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
