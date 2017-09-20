package com.wqz.hcc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.pegdown.PegDownProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wqz.hcc.utils.FileUtils;

@Controller
@RequestMapping("/api")
public class APIDocController
{
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public void getDoc(HttpServletResponse response) throws IOException
	{
        String html = FileUtils.readResourcesByLinesWithEnter("API_DOC.md");
        PegDownProcessor pdp = new PegDownProcessor(Integer.MAX_VALUE);
        html = pdp.markdownToHtml(html);
        response.setHeader("Content-Type", "text/html; charset=utf-8");
        response.getWriter().println(html);
	}
}
