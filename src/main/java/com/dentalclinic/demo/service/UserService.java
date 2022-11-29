package com.dentalclinic.demo.service;

import com.dentalclinic.demo.entity.UserEntity;
import com.dentalclinic.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> fetchUsers() { return userRepository.findAll(); }

    public UserEntity find_user_by_uuid(int uuid) {
        return userRepository.findById(uuid).orElseThrow();
    }

    public UserEntity find_user_by_email(String email) {
        return userRepository.findByEmail(email);
    }

    public void create(
        String email,
        String password,
        String first_name,
        String last_name,
        String birthdate,
        String phone
    ) {
        UserEntity user = new UserEntity();
        user.set_email(email);
        user.set_password(password);
        user.set_first_name(first_name);
        user.set_last_name(last_name);
        user.set_birthdate(birthdate);
        user.set_phone(phone);
        userRepository.save(user);
    }

    public int is_user_login_valid(String email, String password){
        return userRepository.IsUserLoginValid(email, password);
    }

}
