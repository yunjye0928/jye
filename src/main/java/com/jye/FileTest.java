package com.jye;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest
{
	public static final String DOCURAY_SERVER_CONFIG_ROOT_PATH = "D:\\Program Files\\DocuRay Server";
	public static final String DOCURAY_CLIENT_SETUP_PATH = DOCURAY_SERVER_CONFIG_ROOT_PATH + File.separator + "test.text";
	
	public static void main(String[] args)
	{
		System.out.println("동작?");
		try (FileOutputStream fos = new FileOutputStream(DOCURAY_CLIENT_SETUP_PATH))
		{
			fos.write("SALT=salt".getBytes());
			fos.write(new byte[] {'\n'});
			fos.write("ENC_SERVER_DEK=encServerDEK".getBytes());
			fos.write(new byte[] {'\n'});
			fos.write("ENC_TSF_DEK=encTSFDEK".getBytes());
			fos.write(new byte[] {'\n'});
			fos.write("SERVER_PUBLIC_KEY=serverPublicKey".getBytes());
			fos.write(new byte[] {'\n'});
			fos.write("ENC_SETUP_FILE_HASH=encSetupFileHash".getBytes());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
