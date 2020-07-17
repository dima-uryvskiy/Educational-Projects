package com.practice.project.controller;

import com.practice.project.entity.Company;
import com.practice.project.entity.Person;
import com.practice.project.entity.Result;
import com.practice.project.entity.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProjectController {

    private static List<Person> persons = new ArrayList<Person>();
    private static List<Company> companies = new ArrayList<Company>();
    private static List<Test> tests = new ArrayList<Test>();
    private static List<Result> results = new ArrayList<Result>();

    @Value("${message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);

        return "index";
    }

    @ModelAttribute
    @RequestMapping(value = { "/person" }, method = RequestMethod.GET)
    public String person(Model model) {

        persons.add(new Person("Dima", "Uryvskiy", 23, "Moon"));
        //persons.add(new Person("Dima", "Test", 23, "Test"));

        model.addAttribute("Persons", persons);

        return "person";
    }

    @ModelAttribute
    @RequestMapping(value = { "/company" }, method = RequestMethod.GET)
    public String company(Model model) {

        companies.add(new Company("Moon", "Rostow", "Большая садовая 50"));

        model.addAttribute("companies", companies);

        return "company";
    }

    @ModelAttribute
    @RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public String test(Model model) {

        tests.add(new Test("2+2", "4"));

        model.addAttribute("tests", tests);

        return "test";
    }

    @ModelAttribute
    @RequestMapping(value = { "/result" }, method = RequestMethod.GET)
    public String personList(Model model) {

        results.add(new Result(100));

        model.addAttribute("results", results);

        return "result";
    }

    @ModelAttribute
    @PostMapping(value = { "/add" })
    public String add(Model model) {

        results.add(new Result(100));

        model.addAttribute("results", results);

        return "result";
    }
}