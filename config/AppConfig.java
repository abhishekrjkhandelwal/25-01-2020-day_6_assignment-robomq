/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

//Application Configuration
package com.robomq.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan("com.robomq")
public class AppConfig 
{
	@Bean
	DataSource dataSource() 
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/Mobile");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("A889026a");
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return driverManagerDataSource;
	}
}

