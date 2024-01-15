package com.jye.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
		DatasourceConfig.class,
		MybatisConfig.class
})
public class DefaultConfig
{

}