package cn.code.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping(value = "/{path}")
	public String path(@PathVariable String path) {
		return path;
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
}
