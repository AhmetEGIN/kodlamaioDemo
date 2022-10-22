package kodlamaioDemo.business;

import kodlamaioDemo.core.Logging.Logger;
import kodlamaioDemo.core.Logging.Loggers;
import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class TeacherManager {
	private TeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;

	}
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		
		Loggers.runLoggers(loggers, teacher.getName());
	}
	
}
