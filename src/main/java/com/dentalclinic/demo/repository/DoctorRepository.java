package com.dentalclinic.demo.repository;
import com.dentalclinic.demo.entity.DoctorEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {}
