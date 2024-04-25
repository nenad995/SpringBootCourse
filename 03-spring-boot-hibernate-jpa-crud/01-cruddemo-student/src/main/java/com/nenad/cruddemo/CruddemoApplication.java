package com.nenad.cruddemo;

import com.nenad.cruddemo.dao.StudentDAO;
import com.nenad.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//readAllStudents(studentDAO);
			//readAllStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudentById(studentDAO);
			//deleteAllStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object");
		Student student = new Student("Nenad", "Kostov", "nenad.kostov@gmail.com");

		System.out.println("Storing student into database");
		studentDAO.save(student);

		System.out.println("ID of the student is: " + student.getId());
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 student objects");
		Student student1 = new Student("Milica", "Stefanov", "milica.stefanov@gmail.com");
		Student student2 = new Student("Milos", "Zlatkovic", "milos.zlatkovic@gmail.com");
		Student student3 = new Student("Filip", "Markov", "filip.markov@gmail.com");

		System.out.println("Storing students into database");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object");
		Student student = new Student("Denis", "Valchev", "denis.valchev@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(student);

		long theId = student.getId();
		System.out.println("Saved student. Generated ID: " + theId);

		System.out.println("Retrieving student with ID: " + theId);
		Student studentById = studentDAO.findById(theId);

		System.out.println("Found the student: " + studentById);
	}

	private void readAllStudents(StudentDAO studentDAO) {
		System.out.println("Getting list of students");
		List<Student> studentList = studentDAO.findAll();

		for (Student student : studentList){
			System.out.println(student);
		}
	}

	private void readAllStudentsByLastName(StudentDAO studentDAO) {
		String lastName = "Kostov";
		System.out.println("Retrieving all students with last name: " + lastName);

		List<Student> studentList = studentDAO.findByLastName(lastName);

		for (Student student : studentList){
			System.out.println(student);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		long theId = 2;
		System.out.println("Searching for student with ID: " + theId);
		Student studentById = studentDAO.findById(theId);

		System.out.println("Changing students email");
		studentById.setEmail("milica.stefanov@yahoo.com");

		System.out.println("Updating student");
		studentDAO.update(studentById);

		System.out.println("Updated student: " + studentById);
	}

	private void deleteStudentById(StudentDAO studentDAO) {
		long studentId = 5;
		System.out.println("Deleting student with ID: " + studentId);
		studentDAO.delete(studentId);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all the students");
		int deletedRows = studentDAO.deleteAllStudents();

		System.out.println("Deleted " + deletedRows + " rows");
	}

}
