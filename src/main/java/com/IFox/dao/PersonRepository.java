package com.IFox.dao;

import com.IFox.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by exphuhong
 * Date 17-11-27.
 * Start
 * 1、Repository 是一个空接口　即是一个标记接口
 * 2、若我们定义的接口继承了Repository，则该接口会被IOC容器识别为一个Repository　Bean
 * 纳入到IOC容器中　进而可以在该接口中定义满足一定规范的方法
 * 3、实际上也可以通过一个注解@RepositoryDefinition注解来替代继承Repository接口
 *
 */
/**
 * 在repository中定义方法
 *1、不是随便声明的，需要符合一定的规范
 * ２、查询方法以find　｜　read　｜get开头
 * ３、涉及条件查询时，条件的属性用条件关键字连接，要注意的是条件属性首字母大写
 * 4、支持级联属性,若当前类有符合条件的属性，则优先使用，而不是级联属性
 * 若需要使用级联属性，则属性之间使用_连接
 * */


/*
@RepositoryDefinition(domainClass = Person.class,idClass = Integer.class)
*/
public interface PersonRepository extends Repository<Person, Integer> {
    //根据name来获取对应的Person
    Person getByName(String name);

    //级联查询
    List<Person> getByAddressId(Integer id);

    //查询id值最大的Person
    @Query(value = "SELECT p from Person p Where p.id = (Select max(p2.id) from Person p2)")
    Person getMaxIdPerson();

    //使用@Query注解传递参数:使用占位符
    @Query(value = "select p from Person p where p.name=?1 AND p.email=?2")
    Person testQueryAnnotationParam1(String name,String email);

    //使用@Query注解传递参数:使用@Param
    @Query(value = "select p from Person p where p.name= :name AND p.email= :email")
    Person testQueryAnnotationParam2(@Param("email")String email,@Param("name")String name);

}
