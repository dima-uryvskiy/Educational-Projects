package com.practice.project;

import com.practice.project.Entity.Company;
import com.practice.project.Entity.Person;
import com.practice.project.Entity.Result;
import com.practice.project.Entity.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.practice.project.DB.ObjectDAO;
import sun.misc.Unsafe;

import java.lang.reflect.Field;


@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		// TODO: Заглушка для WARNING: An illegal reflective access operation has occurred
		disableWarning();

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

	public static void disableWarning() {
		try {
			Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe"); theUnsafe.setAccessible(true);
			Unsafe u = (Unsafe) theUnsafe.get(null);
			Class cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
			Field logger = cls.getDeclaredField("logger");
			u.putObjectVolatile(cls, u.staticFieldOffset(logger), null);
		} catch (Exception e) {

		}
	}
}
