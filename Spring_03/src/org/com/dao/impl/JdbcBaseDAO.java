package org.com.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcBaseDAO extends JdbcDaoSupport {

	@Resource
	public void setDataSourceBean(DataSource dataSource){
		//��ע���dataSource��daosupport����
		super.setDataSource(dataSource);
	}
}
