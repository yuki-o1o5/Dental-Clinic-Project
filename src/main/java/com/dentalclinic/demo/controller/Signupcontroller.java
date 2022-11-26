package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import com.dentalclinic.demo.entity.SignupEntity;
import com.dentalclinic.demo.repository.SignupRepository;

@Controller
 @RequestMapping("/signup") 
public class Signupcontroller {

  @Autowired
  SignupRepository signupRepository;

  // @RequestMapping(value="/new", method = RequestMethod.GET)
  @GetMapping //feedback?
  public String displayProjectForm(Model model) {
    model.addAttribute("signup", new SignupEntity());
    return "signup/signup";
  }

  @PostMapping("/save")
  public String signup(SignupEntity signup, Model model) {
    System.out.println(signup.getFirstName());
    System.out.println(signup.getLastName());
    System.out.println(signup.getBirthDate());
    System.out.println(signup.getEmail());
    System.out.println(signup.getPhoneNumber());
    System.out.println(signup.getPassword());
    System.out.println("###################");

    signupRepository.save(signup);
    return "redirect:/login";  
    // return "redirect:/signup/new";   
  }


}
