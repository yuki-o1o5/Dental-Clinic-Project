package com.dentalclinic.demo.repository;

import com.dentalclinic.demo.entity.AppointmentEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointMentRepository extends JpaRepository<AppointmentEntity, Integer> {

    // @Query("SELECT a FROM appointments a WHERE a.user_uuid = ?1")
    // List<AppointmentEntity> fetchByUserUuid(int user_uuid);

}
