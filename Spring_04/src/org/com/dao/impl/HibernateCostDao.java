package org.com.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.com.dao.CostDAO;
import org.com.entity.Cost;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class HibernateCostDao implements CostDAO {

	@Resource
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Cost> findAll() {
		// TODO Auto-generated method stub
		String hql = "from Cost";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List<Cost> costList = query.list();
		return costList;
	}

	@Override
	public Cost findById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		return session.get(Cost.class, id);
	}

	@Override
	public void save(Cost cost) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(cost);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Cost cost = findById(id);
		if(cost != null){
			Session session = sessionFactory.openSession();
			session.delete(cost);
		}
	}

	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.update(cost);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
//		String hql = "select count(*) from Cost";
//		List list = getHibernateTemplate().find(hql);
//		int size = Integer.parseInt(list.get(0).toString())
		int size = findAll().size();
		return size;
	}

	@Override
	public List<Cost> findByPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		String hql = "from Cost";
		Query query = session.createQuery(hql);
		query.setFirstResult((page - 1) * pageSize);
		query.setMaxResults(pageSize);
		List<Cost> costList = query.list();
		return costList;
	}

}
