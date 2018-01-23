package com.demo.dao;

import java.util.List;
import com.demo.entity.Person;

public interface PersonDao {
	/**
     * ����һ����¼
     * @param person
     */
    void insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}
