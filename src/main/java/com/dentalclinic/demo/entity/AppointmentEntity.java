package com.dentalclinic.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class AppointmentEntity {
    @Id
    @GeneratedValue
    private int uuid;

    @Column(nullable = false)
    private int doctor_schedule_uuid;

    @Column(nullable = false)
    private int user_uuid;

    public void set_doctor_schedule_uuid(int uuid) {
        this.doctor_schedule_uuid = uuid;
    }

    public void set_user_uuid(int uuid) {
        this.user_uuid = uuid;
    }
}
