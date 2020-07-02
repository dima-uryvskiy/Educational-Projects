package com.practice.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.practice.project.DB.ObjectDAO;


@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		ObjectDAO dao = new ObjectDAO();

		Company company = new Company("Moon", "Rostow", "Большая садовая 50", "77889911");
		Person person = new Person("Dima", "Uryvskiy", 23, "Moon");
		Test test = new Test("2+2", "4");
		Result result = new Result(100);

		dao.addValue(company);
		dao.addValue(person);
		dao.addValue(test);
		dao.addValue(result);
	}
}
