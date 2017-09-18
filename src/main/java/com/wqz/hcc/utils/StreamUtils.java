package com.wqz.hcc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class StreamUtils
{
	public static InputStream getMultipartFileStream(MultipartFile file)
	{
		try
		{
			return file.getInputStream();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
