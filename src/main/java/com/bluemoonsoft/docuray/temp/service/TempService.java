package com.bluemoonsoft.docuray.temp.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bluemoonsoft.docuray.temp.domain.SCTemp29201;

@Service
public interface TempService
{
	public Map<String, String> receiveSCTempPacketForSuspiciousWriteAccessLog(SCTemp29201 scTemp29201);
}