package org.com.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * ��һ����¼ת����һ��Cost����
 *
 */
public class CostRowMapper implements RowMapper<Cost>{

	/**
	 * rs:	�����
	 * index����ǰ��¼������
	 * return������һ��ʵ�����
	 */
	@Override
	public Cost mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		Cost cost = new Cost();
		cost.setId(rs.getInt("ID"));
		cost.setName(rs.getString("NAME"));
		cost.setBaseDuration(rs.getInt("BASE_DURATION"));
		cost.setBaseCost(rs.getFloat("BASE_COST"));
		cost.setUnitCost(rs.getFloat("UNIT_COST"));
		cost.setStatus(rs.getString("STATUS"));
		cost.setDescr(rs.getString("DESCR"));
		cost.setCreateTime(rs.getDate("CREATETIME"));
		cost.setStartTime(rs.getDate("STARTTIME"));
		return cost;
	}

}
