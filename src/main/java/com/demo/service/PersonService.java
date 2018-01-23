package com.demo.service;

import java.util.List;

import com.demo.entity.Person;

public interface PersonService {
	/**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
