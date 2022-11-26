package com.dentalclinic.demo.repository;
import com.dentalclinic.demo.entity.DoctorScheduleEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorScheduleEntity, Integer> {
    @Query(value="SELECT d FROM DoctorScheduleEntity d WHERE d.uuid NOT IN (SELECT DISTINCT a.doctor_schedule_uuid FROM AppointmentEntity a)")
    List<DoctorScheduleEntity> fetchAvailableDates();
}
