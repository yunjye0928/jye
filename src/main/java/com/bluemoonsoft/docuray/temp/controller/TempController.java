package com.bluemoonsoft.docuray.temp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bluemoonsoft.docuray.temp.domain.SCTemp29201;
import com.bluemoonsoft.docuray.temp.service.TempService;

@Controller
@RequestMapping("/server/temp")
public class TempController
{
	@Autowired TempService tempService;
	
	//Suspicious Write Access Log
	
	@RequestMapping(value="/29201")
	public Map<String, String> receiveSCTempPacketForSuspiciousWriteAccessLog(@RequestBody SCTemp29201 ScTemp29201)
	{
		return tempService.receiveSCTempPacketForSuspiciousWriteAccessLog(ScTemp29201);
	}
}