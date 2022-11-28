package com.dentalclinic.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAppointmentDto {

    private String first_name;
    private String last_name;
    private String appointment_time;
    private String doctor_name;


    // https://neginegitoro.hatenablog.com/entry/spring-data-jpa-join-query-result
    public UserAppointmentDto(Object[] objects) {
        this(
            (String) objects[0],
            (String) objects[1],
            (String) objects[2],
            (String) objects[3]
        );
    }
}
