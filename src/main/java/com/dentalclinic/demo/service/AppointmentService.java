package com.dentalclinic.demo.service;

import com.dentalclinic.demo.entity.AppointmentEntity;
import com.dentalclinic.demo.repository.AppointMentRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AppointmentService {
    @Autowired
    AppointMentRepository appointmentRepository;

    public List<AppointmentEntity> get_appointments() {
        return appointmentRepository.findAll();
    }

    public void create(int doctor_schedule_uuid, int user_uuid) {
        AppointmentEntity appoint = new AppointmentEntity();
        appoint.set_doctor_schedule_uuid(doctor_schedule_uuid);
        appoint.set_user_uuid(user_uuid);
        appointmentRepository.save(appoint);
    }

    public List<AppointmentEntity> get_appointments_by_user_uuid(int user_uuid) {
        return appointmentRepository.fetchByUserUuid(user_uuid);
    }
}
