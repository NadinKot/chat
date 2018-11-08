package app.dao.impl;

import app.dao.interfaces.UsersDAO;
import app.model.Users;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "usersDAO")
public class UsersDAOImpl extends GenericDAOImpl<Users> implements UsersDAO {

	@Override
	public List<Users> getAllUsersByFullName(String name, String surname){
		Query<Users> theQuery = getCurrentSession().createQuery("from Users where firstName=:userName and lastName=:userSurname", Users.class);
		theQuery.setParameter("userName", name).setParameter( "userSurname",  surname);
		List<Users> allUsersByFullName = theQuery.getResultList();
		return allUsersByFullName;
	}

	/*@Override
	public List<Users> getUsersById(int id){
		Query<Users> theQuery = getCurrentSession().createQuery("from Users where id=:userId", Users.class);
		theQuery.setParameter("userId", id);
		List<Users> usersById = theQuery.getResultList();
		return usersById;
	}*/

	@Override
	public void deleteUsersByFullName(String name, String surname){
		Query<Users> theQuery = getCurrentSession().createQuery("delete from Users where firstName=:userName and lastName=:userSurname");
		theQuery.setParameter("userName", name).setParameter( "userSurname",  surname);
		theQuery.executeUpdate();
	}


}
