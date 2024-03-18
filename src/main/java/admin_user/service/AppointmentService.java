package admin_user.service;

import admin_user.dto.AppointmentDto;
import admin_user.model.Appointment;

public interface AppointmentService {
	//user implimentation with Save.have to save Dto 
	Appointment save (AppointmentDto appointmentDtoDto);
	

}
