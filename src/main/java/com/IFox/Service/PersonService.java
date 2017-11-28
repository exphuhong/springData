package com.IFox.Service;

import com.IFox.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by exphuhong
 * Date 17-11-28.
 * Start
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void updateName(Integer id, String name) {
        personRepository.updataName(id, name);
    }
}
