package com.dentalclinic.demo.service;

import com.dentalclinic.demo.entity.DoctorEntity;
import com.dentalclinic.demo.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<DoctorEntity> fetchDoctors() {
        return doctorRepository.findAll();
    }

    public DoctorEntity find_doctor_by_uuid(Integer uuid) {
        return doctorRepository.findById(uuid).orElseThrow();
    }
}
