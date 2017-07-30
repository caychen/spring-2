package org.com.dao.impl;

import java.util.List;


import org.com.dao.CostDAO;
import org.com.entity.Cost;
import org.com.entity.CostRowMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class JdbcCostDAO extends JdbcBaseDAO implements CostDAO {

	
	
	@Override
	public List<Cost> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from COST";
		RowMapper<Cost> mapper = new CostRowMapper();
		
		List<Cost> costList = getJdbcTemplate().query(sql, mapper);
		return costList;
	}

	@Override
	public Cost findById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from COST where ID=?";
		Object[] params = {id};
		
		RowMapper<Cost> mapper = new CostRowMapper();
		//只针对记录只有一条的
		Cost cost = getJdbcTemplate().queryForObject(sql, params, mapper);
		
		return cost;
	}

	@Override
	public void save(Cost cost) {
		// TODO Auto-generated method stub
		String sql = "insert into COST(NAME,BASE_DURATION,BASE_COST,UNIT_COST,STATUS,DESCR,CREATETIME)"
				+ " values(?,?,?,?,?,?,?)";
		Object[] params = { cost.getName(), cost.getBaseDuration(), cost.getBaseCost(), cost.getUnitCost(),
				cost.getStatus(), cost.getDescr(), cost.getCreateTime() };

		getJdbcTemplate().update(sql, params);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql = "delete from COST where ID=?";
		Object[] params = { id };
		getJdbcTemplate().update(sql, params);
	}

	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		String sql = "update COST set " + "NAME=?," + "BASE_DURATION=?," + "BASE_COST=?," + "UNIT_COST=?," + "STATUS=?,"
				+ "DESCR=?," + "CREATETIME=?," + "STARTTIME=? " + "where ID=?";

		Object[] params = { cost.getName(), cost.getBaseDuration(), cost.getBaseCost(), cost.getUnitCost(),
				cost.getStatus(), cost.getDescr(), cost.getCreateTime(), cost.getStartTime(), cost.getId() };

		getJdbcTemplate().update(sql, params);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from COST";
		return getJdbcTemplate().queryForObject(sql, Integer.class).intValue();
	}

}
