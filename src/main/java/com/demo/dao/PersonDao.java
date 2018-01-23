package com.demo.dao;

import java.util.List;
import com.demo.entity.Person;

public interface PersonDao {
	/**
     * 插入一条记录
     * @param person
     */
    void insert(Person person);
    
    /**
     * 查询所有
     * @return
     */
    List<Person> queryAll();
}
