package app.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Mapper<Entity, Dto> {
	public List<Dto> mapListEntityToDto(List<Entity> entityList) {
		if (entityList == null) {
			return Collections.emptyList();
		}
		return entityList.stream().map(this::mapEntityToDto).collect(Collectors.toList());
	}

	public abstract Dto mapEntityToDto(Entity entity);
}
