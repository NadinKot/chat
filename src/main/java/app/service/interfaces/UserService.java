package app.service.interfaces;

import app.model.Users;

import java.util.List;

public interface UserService {
	Users findUserById(int id);

	List<Users> findAllUsers();

	void saveUser(Users user);

	void updateUser(Users user);

	void deleteUser(Users user);
}
