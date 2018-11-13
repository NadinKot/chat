package app.mapper;

import app.DTO.UserDTO;
import app.model.Users;

public class UserMapper extends Mapper<Users, UserDTO> {
	@Override
	public UserDTO mapEntityToDto(Users users) {
		if (users == null) {
			return null;
		}
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName(users.getFirstName());
		userDTO.setLastName(users.getLastName());
		userDTO.setTelNumber(users.getTelNumber());
		userDTO.setEmail(users.getEmail());
		return userDTO;
	}
}
