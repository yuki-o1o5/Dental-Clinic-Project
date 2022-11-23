package com.dentalclinic.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctors")
public class DoctorEntity {
    @Id
    @GeneratedValue
    private int uuid;

    @Column(name = "name")
    private String name;

    public String get_name() { return name; }
}
