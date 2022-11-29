package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dentalclinic.demo.entity.UserEntity;
import com.dentalclinic.demo.service.UserService;

@Controller
public class LoginController {
  @Autowired
  UserService userService;

  @GetMapping("/login")
  public String displayhome() { return "index"; }

  @PostMapping("/login/try")
  public String signup(String email, String password, Model model) {
    if (userService.is_user_login_valid(email, password) == 0) { return "redirect:/login"; }
    UserEntity user = userService.find_user_by_email(email);
    return String.format("redirect:/home?user_uuid=%s", user.getUuid());
  }
}
