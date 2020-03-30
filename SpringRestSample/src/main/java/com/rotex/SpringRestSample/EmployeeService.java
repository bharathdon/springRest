package com.rotex.SpringRestSample;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@XmlRootElement
@RestController
public class EmployeeService {

	
	@GetMapping(path = "/emp",produces = "application/xml")
	public List<Employees> find(){
		ArrayList<Employees> arrayList = new ArrayList<Employees>();
		arrayList.add(new Employees(1, "abc", 100d));
		arrayList.add(new Employees(2, "def", 200d));
		
		return arrayList;
		
	}
}
