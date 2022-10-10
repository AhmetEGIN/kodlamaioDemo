package kodlamaioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.dataAccess.hibernate.HibernateEntityRepositoryBase;
import kodlamaioDemo.dataAccess.CourseDao;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {
	private List<Course> courses;

	public HibernateCourseDao() {
		courses = new ArrayList<>();
		courses.add(new Course(1, 1, 1, "Java", 100));
		courses.add(new Course(2, 2, 2, "C#", 150));

	}

	@Override
	public void add(Course entity) {
		courses.add(entity);
		System.out.println("Hibernate ile eklendi" + entity.getName());

	}

	@Override
	public List<Course> get() {
		return courses;
	}

}
