package com.rest.controller;

import com.rest.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
	@ApiOperation(value = "get person object", notes = "return person with given id")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "A Person")})
	public Person getPerson(
			@ApiParam(value = "PersonId", hidden = false)
			@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		Person p = personService.getPerson(id);
		return p;
	}

	@RequestMapping("/person/mock")
	@ApiOperation(value = "get mock person object", notes = "return mock person for given fileName")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "A Person")})
	public Person getMockPerson(
			@ApiParam(value = "FileName", hidden = false)
			@RequestParam(value = "fileName", required = false, defaultValue = "0") String fileName) {
		Person p = personService.getMockPerson(fileName);
		return p;
	}
}