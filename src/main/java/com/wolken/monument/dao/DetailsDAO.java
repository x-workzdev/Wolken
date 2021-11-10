package com.wolken.monument.dao;

import java.util.List;

import com.wolken.monument.entity.DetailsEntity;

public interface DetailsDAO {
	
	void save(DetailsEntity entity);

	List<DetailsEntity> getAll();

}
