package com.wolken.monument.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.entity.DetailsEntity;

@Component
public class DetailsDAOImpl implements DetailsDAO {
	@Autowired
	SessionFactory factory;

	public void save(DetailsEntity entity) {
		Session session = null;
		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			session.close();
		}

	}

	public List<DetailsEntity> getAll() {
		Session session = null;
		List<DetailsEntity> list = null;
		try {
			session = factory.openSession();
			Query query=session.createNamedQuery("getAll");
			list=query.list();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			session.close();
		}
		return list;
	}

}
