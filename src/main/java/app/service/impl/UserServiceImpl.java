package app.service.impl;

import app.DTO.UserDTO;
import app.dao.interfaces.UsersDAO;
import app.mapper.UserMapper;
import app.model.Users;
import app.service.interfaces.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service (value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDAO usersDAO;
	final Logger log = Logger.getLogger(UserServiceImpl.class);

	public static final UserMapper USER_MAPPER = new UserMapper();

	@Transactional
	@Override
	public void deleteUser(Users user){
		log.debug("Delete a user with name " + user.getFirstName() + " " + user.getLastName());
		usersDAO.delete(user);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UserDTO> findUsersByFilter(String filter) {
		return USER_MAPPER.mapListEntityToDto(usersDAO.getUsersByFilter(filter));
	}

	@Transactional
	@Override
	public void saveUser(Users user){
		log.debug("Save new user " + user.getFirstName() + " " + user.getLastName());
		usersDAO.save(user);
	}

	@Transactional
	@Override
	public void updateUser(Users user){
		log.debug("Update data of the user: " + user.getFirstName() + " " + user.getLastName());
		usersDAO.save(user);
	}

	@Transactional
	@Override
	public List<Users> findAllUsers() {
		log.warn("Get all registered users");
		return usersDAO.findAll();
	}

	@Transactional
	@Override
	public Users findUserById(int id){
		log.warn("Get user with id " + id);
		return usersDAO.findById(id);
	}

}
