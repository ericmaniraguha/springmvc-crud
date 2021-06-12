package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.Respository.UserRepository;
import net.javaguides.springboot.model.User;


@Controller
public class UserController {
    @Autowired
    private UserRepository repo;
     
    @GetMapping("/users")
    public String listAll(Model model) {
        List<User> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }    
     
}


///And then you can use the repository in a Spring MVC controller or business class like this: