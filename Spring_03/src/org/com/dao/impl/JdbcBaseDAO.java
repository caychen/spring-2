package org.com.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcBaseDAO extends JdbcDaoSupport {

	@Resource
	public void setDataSourceBean(DataSource dataSource){
		//将注入的dataSource给daosupport传入
		super.setDataSource(dataSource);
	}
}
