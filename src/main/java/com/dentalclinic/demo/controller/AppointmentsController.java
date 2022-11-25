package com.dentalclinic.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentsController {
  @GetMapping("/appointments")
  public String displayappointments(){
    return "appointments/appointments";
  }
}
