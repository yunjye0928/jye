package com.bluemoonsoft.docuray.temp.dao;

import org.springframework.stereotype.Repository;

import com.bluemoonsoft.docuray.temp.domain.SCTemp29201;

@Repository
public interface SuspiciousLogDao
{
	int insertSCTempPacketIntoSuspiciousWriteAccesslog(SCTemp29201 scTemp29201);
}
