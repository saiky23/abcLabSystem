package admin_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.dto.AppointmentDto;
import admin_user.model.Appointment;
import admin_user.repositories.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {


	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Appointment save(AppointmentDto appointmentDto) {
		Appointment appointment = new Appointment(appointmentDto.getFullname(), appointmentDto.getMobileNo(),
				appointmentDto.getAddress(),
				appointmentDto.getDate(), appointmentDto.getStatus(), appointmentDto.getTestType(),
				appointmentDto.getResult01(), appointmentDto.getResult02(), appointmentDto.getResult03(),
				appointmentDto.getResult04(),appointmentDto.getToken());
		return appointmentRepository.save(appointment);
	}

}
