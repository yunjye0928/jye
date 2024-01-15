package com.jye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jye.dao.DefaultDao;

@Service
public class DefaultService
{
	@Autowired
	private DefaultDao defaultDao;
	
	public String getConfig()
	{
		return defaultDao.test();
	}
}
