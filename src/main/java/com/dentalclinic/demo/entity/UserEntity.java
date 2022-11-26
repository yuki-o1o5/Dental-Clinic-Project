package com.dentalclinic.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    private int uuid;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "phone")
    private String phone;

    public void set_email(String email){ this.email = email; }
    public void set_password(String password){ this.password = password; }
    public void set_first_name(String first_name){ this.first_name =first_name; }
    public void set_last_name(String last_name){ this.last_name = last_name; }
    public void set_birthdate(String birthdate){ this.birthdate = birthdate; }
    public void set_phone(String phone){ this.phone = phone; }
}
