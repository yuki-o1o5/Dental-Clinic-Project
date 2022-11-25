package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dentalclinic.demo.dao.iSignupRepository;
import com.dentalclinic.demo.entity.Signup;

@Controller
 @RequestMapping("/signup") 
public class SignupController {
 
  @Autowired
  iSignupRepository signupRepository;
  
  // @RequestMapping(value="/new", method = RequestMethod.GET)
  @GetMapping //feedback?
  public String displayProjectForm(Model model) {
    model.addAttribute("signup", new Signup());
    return "signup/signup";
  }

  @PostMapping("/save")
  public String signup(Signup signup, Model model) {
    System.out.println(signup.getFirstName());
    System.out.println(signup.getLastName());
    System.out.println(signup.getBirthDate());
    System.out.println(signup.getEmail());
    System.out.println(signup.getPhoneNumber());
    System.out.println(signup.getPassword());
    System.out.println("###################");

    signupRepository.save(signup);
    return "redirect:/home";  
    // return "redirect:/signup/new";   
  }


}
