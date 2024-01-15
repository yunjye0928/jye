package com.jye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jye.config.TilesConfig;
import com.jye.dao.DefaultDao;
import com.jye.service.DefaultService;

@Controller
public class DefaultController
{
	final String DEFAULT_PAGE = "main/default";
	
	@Autowired
	private DefaultService defaultService;
	
	@RequestMapping(value = "")
	public String defaultPage()
	{
		System.out.println(defaultService.getConfig());
		return TilesConfig.setTilesURL(DEFAULT_PAGE);
	}
}
