package app.dao.impl;

import app.dao.interfaces.GenericDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository(value = "genericDAO")
public abstract class GenericDAOImpl<Entity> implements GenericDAO<Entity> {

	private Class<Entity> entityClass;

	public GenericDAOImpl() {
		entityClass = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}


	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public void delete(Entity entity){
		getCurrentSession().delete(entity);
	}

	@Override
	public void save(Entity entity){
		getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public Entity findById(int id) {
		return getCurrentSession().get(entityClass, id);
	}


	@Override
	public List<Entity> findAll() {
		return getCurrentSession().createQuery("FROM " + entityClass.getName()).list();
	}

	@Override
	public void deleteByID(int id) {
		Entity entity = findById(id);
		delete(entity);
	}

	public final void setEntityClass(Class<Entity> entityClass) {
		this.entityClass = entityClass;
	}

	public Class<Entity> getEntityClass() {
		return entityClass;
	}

	protected final Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
}
