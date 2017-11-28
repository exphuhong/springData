package com.IFox.springData;

import com.IFox.dao.PersonRepository;
import com.IFox.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by exphuhong
 * Date 17-11-27.
 * Start
 */
public class SpringDataTest {
    private ApplicationContext context = null;
    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testQueryAnnotation2() {
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Person maxIdPerson = personRepository.testQueryAnnotationParam2("huhong@163.com","huhong");
        System.out.println(maxIdPerson);
    }

    @Test
    public void testQueryAnnotation() {
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Person maxIdPerson = personRepository.testQueryAnnotationParam1("huhong","huhong@163.com");
        System.out.println(maxIdPerson);
    }
    @Test
    public void testMaxIdPerson() {
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Person maxIdPerson = personRepository.getMaxIdPerson();
        System.out.println(maxIdPerson);
    }

    @Test
    public void testKeyWords() {
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        List<Person> persons = personRepository.getByAddressId(1);
        System.out.println(persons.get(0).toString());
    }

    @Test
    public void testPersonRepository() {
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Person person = personRepository.getByName("huhong");
        System.out.println(person);
    }

    @Test
    public void testEntityManager() {

    }

    @Test
    public void test() {
        DataSource dataSource =  context.getBean(DataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
