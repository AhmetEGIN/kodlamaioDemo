package kodlamaioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.dataAccess.hibernate.HibernateEntityRepositoryBase;
import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {
	private List<Teacher> teachers;

	public HibernateTeacherDao() {
		teachers = new ArrayList<>();
		teachers.add(new Teacher(1, "Engin Demiroð"));
		teachers.add(new Teacher(2, "Esra Sancak"));
	}

	@Override
	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println("Hibernate ile eklendi" + teacher.getName());

	}

	@Override
	public List<Teacher> get() {
		return teachers;
	}

}
