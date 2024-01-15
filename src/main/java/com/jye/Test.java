package com.jye;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class Test {
	public static void main(String[] args) throws IOException
	{
		String request = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		byte[] rawData = IOUtils.toByteArray(request);
		
		String header = new String(rawData).split("\\.")[0];
		String payload = new String(rawData).split("\\.")[1];
		String signature = new String(rawData).split("\\.")[2];
		System.out.println("================================");
		System.out.println(header);
		System.out.println(payload);
		System.out.println(signature);
		System.out.println("================================");
		String[] split = new String(rawData).split("\\.");
		String clientId = split[0];
		System.out.println(clientId);
		String payLoad = split[1];
		System.out.println(payLoad);
	}
}