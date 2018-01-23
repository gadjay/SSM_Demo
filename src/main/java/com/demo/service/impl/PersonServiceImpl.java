package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.PersonDao;
import com.demo.entity.Person;
import com.demo.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    
	@Autowired
    private PersonDao personDao;

    public PersonDao getPersonMapper() {
        return personDao;
    }
    public void setPersonMapper(PersonDao personDao) {
        this.personDao = personDao;
    }
    
	public List<Person> loadPersons() {
		return personDao.queryAll();
	}
    
}
