package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service_class 
{
	@Autowired(required = true)
	Datastorage ds;
	public void run()
	{
		ds.add();
	}
}
