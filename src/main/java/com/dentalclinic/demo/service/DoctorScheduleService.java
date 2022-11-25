package com.dentalclinic.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dentalclinic.demo.entity.DoctorScheduleEntity;
import com.dentalclinic.demo.repository.DoctorScheduleRepository;

@Service
@Transactional
public class DoctorScheduleService {
    @Autowired
    DoctorScheduleRepository doctorScheduleRepository;

    public List<DoctorScheduleEntity> fetch_available_schedules() {
        return doctorScheduleRepository.fetchAvailableDates();
    }

    public DoctorScheduleEntity find_schedule_by_uuid(Integer schedule_id) {
        return doctorScheduleRepository.findById(schedule_id).orElseThrow();
    }
}
