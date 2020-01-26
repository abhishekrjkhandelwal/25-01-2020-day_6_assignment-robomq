/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

package com.robomq.dao;

import java.util.List;

import com.robomq.pojo.Mobile;

//MobileDao Interface
public interface MobileDAO 
{
	Mobile getMobileById(Long id);

	List<Mobile> getAllMobiles();

	boolean deleteMobile(Mobile mobile);

	boolean updateMobile(Mobile mobile);

	boolean createMobile(Mobile mobile);

}
