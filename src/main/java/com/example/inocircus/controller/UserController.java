package com.example.inocircus.controller;

import com.example.inocircus.models.User;
import com.example.inocircus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    public UserController(UserRepository userRepository) {
    }

    @GetMapping("/users")
    public String getAll(User model, @Param("email") String email) {
        return "users";
    }

    @GetMapping("/users/new")
    public String addTutorial(User model) {
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveTutorial(User user, RedirectAttributes redirectAttributes) {
        return "redirect:/users";
    }

    @GetMapping("/users/{id}")
    public String editTutorial(@PathVariable("id") Integer id, User model, RedirectAttributes redirectAttributes) {
        return "user_form";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteTutorial(@PathVariable("id") Integer id, User model, RedirectAttributes redirectAttributes) {
        return "redirect:/tutorials";
    }
}
