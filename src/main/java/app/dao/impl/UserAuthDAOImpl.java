package app.dao.impl;

import app.dao.interfaces.UserAuthDAO;
import app.model.UserAuth;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userAuthDAO")
public class UserAuthDAOImpl extends GenericDAOImpl<UserAuth> implements UserAuthDAO{

	@Override
	public List<UserAuth> getUsersCredByLogin(String login) {
		Query<UserAuth> theQuery = getCurrentSession().createQuery("from UserAuth where login=:userAuthLogin", UserAuth.class);
		theQuery.setParameter("userAuthLogin", login);
		List<UserAuth> userCred = theQuery.getResultList();
		return userCred;
	}

	@Override
	public void deleteUserCred(String login){
		Query<UserAuth> theQuery = getCurrentSession().createQuery("delete from UserAuth where login=:userAuthLogin");
		theQuery.setParameter("userAuthLogin", login);
		theQuery.executeUpdate();
	}
}
