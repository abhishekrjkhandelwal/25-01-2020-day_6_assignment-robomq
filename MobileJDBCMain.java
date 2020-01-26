/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

package com.robomq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config.AppConfig;
import com.robomq.dao.MobileDAO;
import com.robomq.pojo.Mobile;



public class MobileJDBCMain {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	     
		MobileDAO mobileDAO = context.getBean(MobileDAO.class);
	
		System.out.println("List of Mobile is:");

		for (Mobile m1 : mobileDAO.getAllMobiles()) 
		{
			System.out.println(m1);
		}
		System.out.println("\nGet mobile with ID 2");
	
		Mobile mobileById = mobileDAO.getMobileById(2L);
		System.out.println(mobileById);
	
		System.out.println("\nCreating person: ");
		Mobile mobile = new Mobile(4L, "nokia", 5000, 100, "64gb");
		System.out.println(mobile);
		mobileDAO.createMobile(mobile);
		System.out.println("\nList of mobile is:");
	
		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		System.out.println("\nDeleting person with ID 2");
		mobileDAO.deleteMobile(mobileById);
	
		System.out.println("\nUpdate person with ID 4");

		Mobile mmobile = mobileDAO.getMobileById(4L);
		mmobile.setName("CHANGED");
		mobileDAO.updateMobile(mmobile);

		System.out.println("\nList of mobile is:");
		for (Mobile m11 : mobileDAO.getAllMobiles()) {
			System.out.println(m11);
		}
		context.close();
	   }
 }
