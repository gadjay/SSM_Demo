package com.demo.service;

import java.util.List;

import com.demo.entity.Person;

public interface PersonService {
	/**
     * ����ȫ����person
     * @return
     */
    List<Person> loadPersons();
}
