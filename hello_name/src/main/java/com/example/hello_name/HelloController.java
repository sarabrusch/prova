package com.example.hello_name;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String hello(Map<String,Object> model, @PathVariable String name) {
		model.put("name", name);
		return "greeting";
	}
}
