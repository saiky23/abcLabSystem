package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin_user.model.Appointment;

@Repository
//Jpa entity appointment
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    
}
