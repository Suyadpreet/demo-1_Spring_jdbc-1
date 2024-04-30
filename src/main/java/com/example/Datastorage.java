package com.example;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Datastorage 
{
	@Autowired(required = true)
	JdbcTemplate jt;
	public void  add()
	{
		int a = jt.update("insert into emp1 values(7,'kamal',95000,'ranwan')");
		if(a>0)
		{
			System.out.println("Record inserted Successfully");
		}
		else
		{
			System.out.println("Record insertion Failed");
		}
	}
}
