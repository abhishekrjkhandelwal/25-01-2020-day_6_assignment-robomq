/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

package com.robomq.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//Row Mapper Interface
public class MobileMapper implements RowMapper<Mobile> {

	public Mobile mapRow(ResultSet resultSet, int i) throws SQLException 
	{
		Mobile mobile = new Mobile();
		mobile.setId(resultSet.getLong("id"));
		mobile.setName(resultSet.getString("name"));
		mobile.setPrice(resultSet.getDouble("price"));
		mobile.setQuantity(resultSet.getInt("quantity"));
		mobile.setDescription(resultSet.getString("description"));
		return mobile;
	}
}

