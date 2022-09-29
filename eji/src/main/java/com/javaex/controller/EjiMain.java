package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EjiMain {
	@RequestMapping("/main")
	public String ejiMain() {
		return "/WEB-INF/views/ejiMain.jsp";
	}
}
