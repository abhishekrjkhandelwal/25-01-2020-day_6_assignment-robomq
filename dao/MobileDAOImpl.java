/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

package com.robomq.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.robomq.pojo.Mobile;
import com.robomq.pojo.MobileMapper;


//MobileDao Implementation
@Component
public class MobileDAOImpl implements MobileDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_MOBILE = "select * from mobile where id = ?";
	private final String SQL_DELETE_MOBILE = "delete from mobile where id = ?";
	private final String SQL_UPDATE_MOBILE = "update mobile set name = ?, price = ?, quantity  = ?, description = ? where id = ?";
	private final String SQL_GET_ALL = "select * from mobile";
	private final String SQL_INSERT_MOBILE = "insert into mobile(id, name, price, quantity, description) values(?,?,?,?,?)";

	@Autowired
	public MobileDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
    // Update mobile Id
	public Mobile getMobileById(Long id) {
		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE, new Object[] { id }, new MobileMapper());
	}
   
	 // Get all Mobile Details
	public List<Mobile> getAllMobiles() {
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}
  
	// Delete Mobile Details
	public boolean deleteMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_DELETE_MOBILE, mobile.getId()) > 0;
	}
    
	//Update Mobile Details
	public boolean updateMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_UPDATE_MOBILE, mobile.getName(), mobile.getPrice(), mobile.getQuantity(), mobile.getDescription(), 
				mobile.getId()) > 0;
	}
	
	//Create Mobile Details
	public boolean createMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_INSERT_MOBILE, mobile.getName(), mobile.getPrice(), mobile.getQuantity(), mobile.getDescription(), 
				mobile.getId()) > 0;
	}
}
