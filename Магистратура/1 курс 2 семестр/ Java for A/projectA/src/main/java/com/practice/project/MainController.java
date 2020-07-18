package com.practice.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private static List<Client> clients = new ArrayList<Client>();
    private static List<Tour> tours = new ArrayList<Tour>();
    private static List<Employee> employees = new ArrayList<Employee>();
    private static List<Request> requests = new ArrayList<Request>();

    @Value("${message}")
    private String message;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        message = "Добрый день, это стартовая страница сайта поддержки военно-исторического туризма. Выберите нужный раздел.";
        model.addAttribute("message", message);

        return "index";
    }

    @ModelAttribute
    @RequestMapping(value = { "/client" }, method = RequestMethod.GET)
    public String person(Model model) {

        clients.add(new Client("Рудин Александр Игоревич", "igor@rambler.ru", "+79185554433"));

        model.addAttribute("Clients", clients);

        return "client";
    }

    @ModelAttribute
    @RequestMapping(value = { "/tour" }, method = RequestMethod.GET)
    public String company(Model model) {

        tours.add(new Tour("Золотая звезда", "1000 руб.", "25.07.2020", "26.07.2020"));
        tours.add(new Tour("Красна звезда", "1500 руб.", "23.07.2020", "24.07.2020"));
        tours.add(new Tour("Белая звезда", "2000 руб.", "26.07.2020", "29.07.2020"));

        model.addAttribute("Tours", tours);

        return "tour";
    }

    @ModelAttribute
    @RequestMapping(value = { "/employee" }, method = RequestMethod.GET)
    public String test(Model model) {

        employees.add(new Employee("Кержаков Александр Витальевич", "менеджер","+79184566690"));

        model.addAttribute("Employees", employees);

        return "employee";
    }

    @ModelAttribute
    @RequestMapping(value = { "/request" }, method = RequestMethod.GET)
    public String personList(Model model) {

        requests.add(new Request(1,1,1, "24.07.2020"));

        model.addAttribute("Requests", requests);

        return "request";
    }
}