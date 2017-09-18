package com.wqz.hcc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propConfig")
public class PropConfig
{	
	@Value("#{setting[saveHeadIconPath]}")
    private String saveHeadIconPath;

	@Value("#{setting[getHeadIconPath]}")
    private String getHeadIconPath;

	public String getSaveHeadIconPath()
	{
		return saveHeadIconPath;
	}

	public void setSaveHeadIconPath(String saveHeadIconPath)
	{
		this.saveHeadIconPath = saveHeadIconPath;
	}

	public String getGetHeadIconPath()
	{
		return getHeadIconPath;
	}

	public void setGetHeadIconPath(String getHeadIconPath)
	{
		this.getHeadIconPath = getHeadIconPath;
	}
}
