package com.rest.controller;

import com.rest.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.component.IPersonService;

@RestController
@RequestMapping("/data")
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	@RequestMapping("/person")
	public Person getPerson(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id) {
		Person p = personService.getPerson(id);
		return p;
	}
}