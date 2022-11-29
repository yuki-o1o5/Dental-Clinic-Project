package com.dentalclinic.demo.repository;
import com.dentalclinic.demo.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);

    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.email = ?1 AND u.password = ?2")
    int IsUserLoginValid(String email, String password);
}
