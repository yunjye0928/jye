package com.jye.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles2.SimpleSpringPreparerFactory;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesView;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(
		basePackages = {"com.jye"},
		useDefaultFilters = false,
		includeFilters = @ComponentScan.Filter({Service.class, Controller.class, Component.class}),
		excludeFilters = @ComponentScan.Filter({Repository.class, Configuration.class})
)
public class ServletConfig extends WebMvcConfigurerAdapter
{
	@Autowired
	Environment env;
	
	/*
	@Autowired
	DatasourceConfig dataSourceConfig;
	*/
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer()
	{
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles/tiles-definition.xml"});
		tilesConfigurer.setPreparerFactoryClass(SimpleSpringPreparerFactory.class);
		tilesConfigurer.setCheckRefresh(true);

		return tilesConfigurer;
	}

	@Bean
	public ViewResolver tilesViewResolver()
	{
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		resolver.setOrder(1);

		return resolver;
	}
	
	@Bean
	public ViewResolver viewBeanNameResolver()
	{
		BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
		beanNameViewResolver.setOrder(0);

		return beanNameViewResolver;
	}
	
	/*
	@Bean
	public PlatformTransactionManager transactionManager()
	{
		return new DataSourceTransactionManager(dataSourceConfig.dataSource());
	}
	*/
}