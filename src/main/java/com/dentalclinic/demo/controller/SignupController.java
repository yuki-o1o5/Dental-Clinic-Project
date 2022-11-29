package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dentalclinic.demo.entity.Signup;
import com.dentalclinic.demo.entity.UserEntity;
import com.dentalclinic.demo.service.UserService;

@Controller
public class SignupController {

  @Autowired
  UserService userService;

  @GetMapping("/signup")
  public String displayProjectForm(Model model) {
    model.addAttribute("signup", new Signup());
    return "signup/signup";
  }

  @PostMapping("/signup/save")
  public String signup(Signup signup, Model model) {
    userService.create(
      signup.getEmail(),
      signup.getPassword(),
      signup.getFirstName(),
      signup.getLastName(),
      signup.getBirthDate(),
      signup.getPhoneNumber()
    );
    UserEntity user = userService.find_user_by_email(signup.getEmail());
    return String.format("redirect:/login", user.getUuid());
  }
}
