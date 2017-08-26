package com.umesh.SpringSecurity.repository;

import com.umesh.SpringSecurity.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by umesh on 8/22/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {


    public List<User> findUserByUserName(String userName);



}
