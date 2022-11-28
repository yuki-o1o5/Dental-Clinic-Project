package com.dentalclinic.demo.repository;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dentalclinic.demo.dto.UserAppointmentDto;
import com.dentalclinic.demo.entity.AppointmentEntity;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {
    // @Query(value="SELECT a FROM AppointmentEntity a WHERE a.user_uuid = ?1")
    // List<AppointmentEntity> fetchByUserUuid(int user_uuid);

    @Query(value="""
        SELECT
            u.first_name AS first_name,
            u.last_name AS last_name,
            ds.time AS time,
            d.name AS doctor_name
        FROM AppointmentEntity a
        LEFT JOIN UserEntity u ON a.user_uuid = u.uuid
        LEFT JOIN DoctorScheduleEntity ds ON a.doctor_schedule_uuid = ds.uuid
        LEFT JOIN DoctorEntity d ON ds.doctor_uuid = d.uuid
        WHERE u.uuid = ?1
        GROUP BY ds.uuid
        ORDER BY ds.time ASC
    """)
    List<Object[]> fetchRawByUserUuid(int user_uuid);

    default List<UserAppointmentDto> fetchByUserUuid(int user_uuid){
        return fetchRawByUserUuid(user_uuid)
            .stream()
            .map(UserAppointmentDto::new)
            .collect(Collectors.toList());
    }
}
