package kodlamaioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.dataAccess.hibernate.HibernateEntityRepositoryBase;
import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao extends HibernateEntityRepositoryBase<Teacher> implements TeacherDao {
	private List<Teacher> teachers;

	public HibernateTeacherDao() {
		teachers = new ArrayList<>();
		teachers.add(new Teacher(1, "Engin Demiroð"));
		teachers.add(new Teacher(2, "E sra Sancak"));
	}

}
