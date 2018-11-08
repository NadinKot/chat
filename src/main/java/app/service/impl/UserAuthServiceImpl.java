package app.service.impl;

import app.dao.interfaces.UserAuthDAO;
import app.model.UserAuth;
import app.service.interfaces.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserAuthServiceImpl implements UserAuthService{
	@Autowired
	private UserAuthDAO userAuthDAO;

	@Transactional
	@Override
	public void updateAuth(UserAuth userAuth){
		userAuthDAO.save(userAuth);
	}


	@Transactional
	@Override
	public List<UserAuth> getAuthList(){
		return userAuthDAO.findAll();
	}
}
