package com.revature.p1.service;

import java.util.ArrayList;

import com.revature.p1.app.Employee;
import com.revature.p1.dao.ErsDAO;
import com.revature.p1.dao.ErsDaoInt;

public class ErsService implements ErsServiceInt{
	
	ErsDaoInt dao = new ErsDAO();
	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

}