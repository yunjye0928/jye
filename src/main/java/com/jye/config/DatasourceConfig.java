package com.jye.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:/properties/DBConnConfig.xml"})
public class DatasourceConfig
{
	final String validationQuery = "select 1";
	final boolean testWhileIdle = true;
	final Long timeBetweenEvictionRunsMillis = (long) 7200000;
	
	@Autowired
	Environment env;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public DataSource dataSource()
	{
		return createDataSource(env.getProperty("db.driver"), env.getProperty("db.url"), env.getProperty("db.username"), env.getProperty("db.password"));
	}
	
	private DataSource createDataSource(String driver, String url, String user, String password)
	{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		dataSource.setUrl(url);

		dataSource.setValidationQuery(validationQuery);
		dataSource.setTestWhileIdle(testWhileIdle);
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);

		return dataSource;
	}
}