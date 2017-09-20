package com.wqz.hcc.utils;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PathUtils
{
	public static String getResourcesPath(String relativePath)
	{
		Resource res = new ClassPathResource(relativePath);
		try
		{
			return res.getFile().getAbsolutePath();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return "";
	}
}
