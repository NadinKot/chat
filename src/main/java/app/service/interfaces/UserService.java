package app.service.interfaces;

import app.DTO.UserDTO;
import app.model.Users;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserService {
	Users findUserById(int id);

	List<Users> findAllUsers();

	void saveUser(Users user);

	void updateUser(Users user);

	void deleteUser(Users user);

	List<UserDTO> findUsersByFilter(String filter);
}
