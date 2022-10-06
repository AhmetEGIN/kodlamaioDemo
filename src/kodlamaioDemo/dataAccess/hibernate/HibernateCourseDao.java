package kodlamaioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.dataAccess.CourseDao;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {
	private List<Course> courses;

	public HibernateCourseDao() {
		courses = new ArrayList<>();
		courses.add(new Course(1, 1, 1, "Java", 100));
		courses.add(new Course(2,2,2, "C#",150));
	}
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate ile eklendi" + course.getName());
		
	}

	@Override
	public boolean getCourse(Course course) {
		for(Course _course : courses) {
			if (_course.getName().equals(course.getName())) {
				return false;
			}
		}
		return true;
	}

}
