package com.dentalclinic.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor_schedules")
public class DoctorScheduleEntity {
    @Id
    @GeneratedValue
    private int uuid;

    @Column(name = "doctor_uuid")
    private int doctor_uuid;

    @Column(name = "time")
    private String time;

    // Getter
    public int get_uuid() { return uuid; }
    public int get_doctor_uuid() { return doctor_uuid; }
    public String get_time() { return time; }
}
