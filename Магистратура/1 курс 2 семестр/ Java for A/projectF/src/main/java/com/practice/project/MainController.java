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

        customers.add(new Customer("Сергеев Касьян Валерьевич", "test1@example.com", "+7(909)961-64-96"));
        customers.add(new Customer("Беляев Вальтер Серапионович", "test2@example.com", "+7(158)021-77-18"));
        customers.add(new Customer("Савельев Варлам Даниилович", "test3@example.com", "+7(904)132-66-25"));
        customers.add(new Customer("Красильников Тимофей Даниилович", "test4@example.com", "+7(979)551-06-37"));

        model.addAttribute("Customers", customers);

        return "customer";
    }

    @ModelAttribute
    @RequestMapping(value = { "/product" }, method = RequestMethod.GET)
    public String company(Model model) {

        products.add(new Product("Набор ключей", "3000 руб.", "777"));
        products.add(new Product("Стелаж 'Пустыня'", "13000 руб.", "888"));
        products.add(new Product("Стелаж 'Лес'", "25000 руб.", "999"));

        model.addAttribute("Products", products);

        return "product";
    }

    @ModelAttribute
    @RequestMapping(value = { "/manager" }, method = RequestMethod.GET)
    public String test(Model model) {

        managers.add(new Manager("Герасимов Ефим Владленович", "менеджер","+7(979)551-06-99"));
        managers.add(new Manager("Владимирова Радослава Якововна", "старший менеджер","+7(979)551-06-77"));

        model.addAttribute("Managers", managers);

        return "manager";
    }

    @ModelAttribute
    @RequestMapping(value = { "/stock" }, method = RequestMethod.GET)
    public String personList(Model model) {

        stocks.add(new Stock(1,1,1, "Ростов-на-Дону ул. Зорге д. 77"));

        model.addAttribute("Stocks", stocks);

        return "stock";
    }
}