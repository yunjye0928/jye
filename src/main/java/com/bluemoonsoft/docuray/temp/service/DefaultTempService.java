package com.bluemoonsoft.docuray.temp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemoonsoft.docuray.temp.dao.SuspiciousLogDao;
import com.bluemoonsoft.docuray.temp.domain.SCTemp29201;

@Service
public class DefaultTempService implements TempService
{
	@Autowired SuspiciousLogDao suspiciousLogDao;
	
	@Override
	public Map<String, String> receiveSCTempPacketForSuspiciousWriteAccessLog(SCTemp29201 scTemp29201)
	{
		Map<String, String> resultMap = new HashMap<>();
		suspiciousLogDao.insertSCTempPacketIntoSuspiciousWriteAccesslog(scTemp29201);
		resultMap.put("result", "SUCCESS");
		return resultMap;
	}
	
}
