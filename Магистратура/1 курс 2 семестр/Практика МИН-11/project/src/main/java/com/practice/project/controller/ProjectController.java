package com.practice.project.controller;

import com.practice.project.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProjectController {

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Dima", "Uryvskiy", 23, "Moon"));
        persons.add(new Person("Dima", "Test", 23, "Test"));
    }

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

        model.addAttribute("persons", persons);

        return "person";
    }

    @ModelAttribute
    @RequestMapping(value = { "/company" }, method = RequestMethod.GET)
    public String company(Model model) {

        model.addAttribute("companies", persons);

        return "company";
    }

    @ModelAttribute
    @RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public String test(Model model) {

        model.addAttribute("tests", persons);

        return "test";
    }

    @ModelAttribute
    @RequestMapping(value = { "/result" }, method = RequestMethod.GET)
    public String personList(Model model) {

        model.addAttribute("results", persons);

        return "result";
    }

//    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
//    public String showAddPersonPage(Model model) {
//
//        PersonForm personForm = new PersonForm();
//        model.addAttribute("personForm", personForm);
//
//        return "addPerson";
//    }
//
//    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
//    public String savePerson(Model model, //
//                             @ModelAttribute("personForm") PersonForm personForm) {
//
//        String firstName = personForm.getFirstName();
//        String lastName = personForm.getLastName();
//
//        if (firstName != null && firstName.length() > 0 //
//                && lastName != null && lastName.length() > 0) {
//            Person newPerson = new Person(firstName, lastName);
//            persons.add(newPerson);
//
//            return "redirect:/personList";
//        }
//
//        model.addAttribute("errorMessage", errorMessage);
//        return "addPerson";
//    }

}