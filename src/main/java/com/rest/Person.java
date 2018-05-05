package com.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

@JsonAutoDetect
public class Person {

	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("age")
	private int age;

	@JsonProperty("account")
	private Account account;

	@JsonProperty("dob")
	private LocalDateTime dob;

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
