package com.IFox.springData;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

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
