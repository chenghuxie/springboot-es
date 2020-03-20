package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiech
 * @create 2019-09-03 14:00
 */
@Repository
public interface UserDao extends CrudRepository<User,String> {

}
