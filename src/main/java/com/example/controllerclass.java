package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerclass 
{
	@Autowired
	service_class cs;
	@RequestMapping(value = "/hello")
	public void show()
	{
		cs.run();
	}
}
