package kodlamaioDemo.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {
	private List<Course> courses;

	public JdbcCourseDao() {
		courses = new ArrayList<>();
		courses.add(new Course(1, 1, 1, "Java", 100));
		courses.add(new Course(2,2,2, "C#",150));
	}
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Jdbc ile eklendi" + course.getName());
		
	}

	@Override
	public List<Course> get() {
		return courses;
	}

}
