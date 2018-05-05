package com.rest.component;

import com.rest.Person;

public interface IPersonService {
  public Person getPerson(Integer id);

  public Person getMockPerson(String fileName);
}
