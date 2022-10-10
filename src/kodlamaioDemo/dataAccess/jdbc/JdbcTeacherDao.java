package kodlamaioDemo.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {
	private List<Teacher> teachers;

	public JdbcTeacherDao() {
		teachers = new ArrayList<>();
		teachers.add(new Teacher(1, "Engin Demiro�"));
		teachers.add(new Teacher(2, "Esra Sancak"));
	}

	@Override
	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println("Jdbc ile eklendi" + teacher.getName());

	}

	@Override
	public List<Teacher> get() {
		return teachers;
	}

}
