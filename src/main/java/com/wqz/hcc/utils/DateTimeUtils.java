package com.wqz.hcc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils
{
	public static Date Str2Date(String datetime)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try
		{
			date = format.parse(datetime);
		} 
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		return date;
	}
	
	public static String date2Str(Date datetime)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(datetime);
	}
	
	
}
