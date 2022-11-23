package com.dentalclinic.demo.repository;
import com.dentalclinic.demo.entity.DoctorScheduleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorScheduleEntity, Integer> {}
