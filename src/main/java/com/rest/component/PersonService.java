package com.rest.component;

import com.rest.mock.read.MockGenerator;
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
		p.setAccount(DBManager.getAccount("Deshan"));
		return p;
	}

	@Override
	public Person getMockPerson(String fileName) {
		Person person = MockGenerator.getMockPerson(fileName);
		return person;
	}

	private Person getInstance(String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}
}
