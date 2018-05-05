package com.rest.mock.read;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.Person;
import com.rest.mock.util.module.DateTimeModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MockGenerator {
    public static Person getMockPerson(String fileName) {
        byte[] mockPerson;
        Person person;
        try {
            mockPerson = Files.readAllBytes(Paths.get(FileManager.getFilePath(fileName)));
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new DateTimeModule());//register new dateTime module
            person = mapper.readValue(mockPerson, Person.class);
            return person;
        } catch (IOException e) {
            e.printStackTrace();
            return new Person();
        }

    }
}
