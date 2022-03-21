package com.kattojava.springdieu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String helloWorld(ModelMap mm) {
		mm.addAttribute("msg", "aaaaaa");
		return "hello";
	}
}
