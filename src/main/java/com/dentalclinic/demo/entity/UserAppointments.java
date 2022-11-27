package com.dentalclinic.demo.entity;

public class UserAppointments {
    private String first_name;
    private String last_name;
    private String appointment_time;
    private String doctor_name;

    public UserAppointments(
        String first_name,
        String last_name,
        String appointment_time,
        String doctor_name
    ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.appointment_time = appointment_time;
        this.doctor_name = doctor_name;
    }

    public String get_first_name(){ return this.first_name; }
    public String get_last_name(){ return this.last_name; }
    public String get_appointment_time(){ return this.appointment_time; }
    public String get_doctor_time(){ return this.doctor_name; }
}
