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
    private static List<Product> products = new ArrayList<Product>();
    private static List<Manager> managers = new ArrayList<Manager>();
    private static List<Shop> shops = new ArrayList<Shop>();

    @Value("${message}")
    private String message;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        message = "Выберите интересующий вас раздел:";
        model.addAttribute("message", message);

        return "index";
    }

    @ModelAttribute
    @RequestMapping(value = { "/client" }, method = RequestMethod.GET)
    public String person(Model model) {

        clients.add(new Client("Суханов Пантелеймон Авдеевич", "sykhanov@rambler.ru", "+7(918)726-0072"));
        clients.add(new Client("Денисов Мартын Степанович", "denisov@rambler.ru", "+7(917)644-6218"));
        clients.add(new Client("Туров Август Натанович", "tyrov@rambler.ru", "+7(916)166-5773"));
        clients.add(new Client("Денисов Арсен Кириллович", "denisov4@rambler.ru", "+7(915)467-7168"));

        model.addAttribute("Clients", clients);

        return "client";
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
    @RequestMapping(value = { "/shop" }, method = RequestMethod.GET)
    public String personList(Model model) {

        shops.add(new Shop(1,1,1, "Ростов-на-Дону ул. Зорге д. 77"));

        model.addAttribute("Shops", shops);

        return "shop";
    }
}