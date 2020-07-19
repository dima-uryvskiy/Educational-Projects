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

    private static List<Customer> customers = new ArrayList<Customer>();
    private static List<Product> products = new ArrayList<Product>();
    private static List<Manager> managers = new ArrayList<Manager>();
    private static List<Stock> stocks = new ArrayList<Stock>();

    @Value("${message}")
    private String message;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        message = "Выберите интересующий вас раздел:";
        model.addAttribute("message", message);

        return "index";
    }

    @ModelAttribute
    @RequestMapping(value = { "/customer" }, method = RequestMethod.GET)
    public String person(Model model) {

        customers.add(new Customer("Рудин Александр Игоревич", "igor@rambler.ru", "+79185554433"));

        model.addAttribute("Customers", customers);

        return "customer";
    }

    @ModelAttribute
    @RequestMapping(value = { "/product" }, method = RequestMethod.GET)
    public String company(Model model) {

        products.add(new Product("Золотая звезда", "1000 руб.", "25.07.2020"));
        products.add(new Product("Красна звезда", "1500 руб.", "23.07.2020"));
        products.add(new Product("Белая звезда", "2000 руб.", "26.07.2020"));

        model.addAttribute("Products", products);

        return "product";
    }

    @ModelAttribute
    @RequestMapping(value = { "/manager" }, method = RequestMethod.GET)
    public String test(Model model) {

        managers.add(new Manager("Кержаков Александр Витальевич", "менеджер","+79184566690"));

        model.addAttribute("Managers", managers);

        return "manager";
    }

    @ModelAttribute
    @RequestMapping(value = { "/stock" }, method = RequestMethod.GET)
    public String personList(Model model) {

        stocks.add(new Stock(1,1,1, "24.07.2020"));

        model.addAttribute("Stocks", stocks);

        return "stock";
    }
}