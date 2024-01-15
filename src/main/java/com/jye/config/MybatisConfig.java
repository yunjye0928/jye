package com.jye.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@MapperScan(basePackages = "com.jye", annotationClass = org.springframework.stereotype.Repository.class)
public class MybatisConfig
{
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, WebApplicationContext context) throws Exception
	{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setTypeAliasesPackage("com.jye");
		factoryBean.setMapperLocations(context.getResources("classpath:/mapper/**/*.xml"));

		return factoryBean;
	}
}
