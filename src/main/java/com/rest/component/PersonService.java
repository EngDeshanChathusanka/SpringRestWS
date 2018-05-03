package com.rest.component;

import org.springframework.stereotype.Component;

import com.rest.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPerson(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setName("Deshan");
		p.setAge(25);
		return p;
	}

	private Person getInstance() {
		return new Person();
	}
}
