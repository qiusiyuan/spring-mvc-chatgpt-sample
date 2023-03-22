package com.siyuan.shoppingbackend.controller;

import com.siyuan.shoppingbackend.model.Product;
import com.siyuan.shoppingbackend.model.User;
import com.siyuan.shoppingbackend.service.ProductService;
import com.siyuan.shoppingbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @GetMapping("/admin/dashboard")
    public String dashboard(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 10, Sort.by(Sort.Direction.ASC, "id"));
        Page<Product> products = productService.findAll(pageable);
        Page<User> users = userService.findAll(pageable);

        model.addAttribute("products", products);
        model.addAttribute("users", users);

        return "admin/dashboard";
    }

    @PostMapping("/admin/addProduct")
    public String addProduct(@RequestParam("name") String name,
                             @RequestParam("price") double price,
                             @RequestParam("description") String description) {
        Product product = new Product(name, price, description);
        productService.save(product);

        return "redirect:/admin/dashboard";
    }

    @GetMapping("/")
    public String showForm() {
        return "sample";
    }

    @PostMapping("/admin/addUser")
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("email") String email,
                          @RequestParam("password") String password) {
        User user = new User(username, email, password);
        userService.save(user);

        return "redirect:/admin/dashboard";
    }

    // Add more admin-related endpoints here as needed
}
