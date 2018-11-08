package app.dao.interfaces;

import app.model.UserAuth;

import java.util.List;


public interface UserAuthDAO extends GenericDAO<UserAuth> {

	List<UserAuth> getUsersCredByLogin(String login);

	void deleteUserCred(String login);
}
