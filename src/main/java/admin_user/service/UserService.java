package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.model.User;

public interface UserService {
	//user implimentation with Save.have to save Dto 
	User save (UserDto userDto);
	

}
