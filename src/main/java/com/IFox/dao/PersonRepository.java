package com.IFox.dao;

import com.IFox.entity.Person;
import org.springframework.data.repository.Repository;

/**
 * Created by exphuhong
 * Date 17-11-27.
 * Start
 * 1、
 */

public interface PersonRepository extends Repository<Person, Integer> {
    //根据name来获取对应的Person
    Person getByName(String name);

}
