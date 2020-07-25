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
    private static List<Order> orders = new ArrayList<Order>();
    private static List<Shop> shops = new ArrayList<Shop>();
    private static List<String> list = new ArrayList<>();

    @Value("${message}")
    private String message;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        message = "Основное меню:";
        model.addAttribute("message", message);

        return "index";
    }

    @ModelAttribute
    @RequestMapping(value = { "/client" }, method = RequestMethod.GET)
    public String client(Model model) {

        clients.add(new Client("Суханов Пантелеймон Авдеевич", "sykhanov@rambler.ru", "+7(918)726-0072"));
        clients.add(new Client("Денисов Мартын Степанович", "denisov@rambler.ru", "+7(917)644-6218"));
        clients.add(new Client("Туров Август Натанович", "tyrov@rambler.ru", "+7(916)166-5773"));
        clients.add(new Client("Денисов Арсен Кириллович", "denisov4@rambler.ru", "+7(915)467-7168"));

        model.addAttribute("Clients", clients);

        return "client";
    }

    @ModelAttribute
    @RequestMapping(value = { "/product" }, method = RequestMethod.GET)
    public String product(Model model) {

        products.add(new Product("Набор чая(подарочный)", "1000 руб.", "50Х20Х30"));
        products.add(new Product("Набор для ремонта машины", "3000 руб.", "70Х50Х30"));
        products.add(new Product("Картина 'Город'", "6000 руб.", "60Х50Х60"));

        model.addAttribute("Products", products);

        return "product";
    }

    @ModelAttribute
    @RequestMapping(value = { "/order" }, method = RequestMethod.GET)
    public String order(Model model) {

        orders.add(new Order("123", "1000 руб.","Ростов-на-Дону ул. Большая Садовая 27"));
        orders.add(new Order("345", "3000 руб.","Ростов-на-Дону ул. Большая Садовая 57"));
        orders.add(new Order("678", "6000 руб","Ростов-на-Дону ул. Большая Садовая 77"));

        model.addAttribute("Orders", orders);

        return "order";
    }

    @ModelAttribute
    @RequestMapping(value = { "/shop" }, method = RequestMethod.GET)
    public String shop(Model model) {

        shops.add(new Shop(1,1,123, "https://tea.ru"));
        shops.add(new Shop(2,2,345, "https://car.ru"));
        shops.add(new Shop(3,3,678, "https://picture.ru"));

        model.addAttribute("Shops", shops);

        return "shop";
    }

    @ModelAttribute
    @RequestMapping(value = { "/add" }, method = RequestMethod.GET)
    public String add(Model model) {

        list.add("new Value");

        model.addAttribute("list", list);

        return "add";
    }
}