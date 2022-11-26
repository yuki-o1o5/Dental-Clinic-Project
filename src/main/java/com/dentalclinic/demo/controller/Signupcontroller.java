package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dentalclinic.demo.dao.iSignupRepository;
import com.dentalclinic.demo.entity.Signup;
import com.dentalclinic.demo.service.UserService;

@Controller
public class Signupcontroller {

  @Autowired
  iSignupRepository signupRepository;

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
    return "redirect:/home";
  }


}
