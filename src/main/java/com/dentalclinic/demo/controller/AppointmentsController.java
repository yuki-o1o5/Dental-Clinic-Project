package com.dentalclinic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dentalclinic.demo.service.AppointmentService;

@Controller
public class AppointmentsController {
  @Autowired
  AppointmentService appointmentService;

  @GetMapping("/appointments")
  public String displayappointments(Model model){
    model.addAttribute("appointments", appointmentService.get_appointments_by_user_uuid(1));
    return "appointments/appointments";
  }
}
