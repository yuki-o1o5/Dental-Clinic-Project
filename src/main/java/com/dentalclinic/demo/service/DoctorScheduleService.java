package com.dentalclinic.demo.service;

import com.dentalclinic.demo.entity.DoctorScheduleEntity;
import com.dentalclinic.demo.repository.DoctorScheduleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorScheduleService {
    @Autowired
    DoctorScheduleRepository doctorScheduleRepository;

    public List<DoctorScheduleEntity> fetchSchedules() {
        return doctorScheduleRepository.findAll();
    }

    public DoctorScheduleEntity find_schedule_by_uuid(Integer schedule_id) {
        return doctorScheduleRepository.findById(schedule_id).orElseThrow();
    }
}
