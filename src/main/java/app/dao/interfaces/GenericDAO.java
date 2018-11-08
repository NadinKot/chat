package app.dao.interfaces;

import java.util.List;

public interface GenericDAO<Entity> {
	Entity findById(int id);

	List<Entity> findAll();

	void save(Entity entity);

	//void update(Entity entity);

	void delete(Entity entity);

	void deleteByID(int id);

}