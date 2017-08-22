package com.umesh.SpringSecurity.service;

import com.umesh.SpringSecurity.model.CustomUserDetails;
import com.umesh.SpringSecurity.model.User;
import com.umesh.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by umesh on 8/22/17.
 */

@Service
public class CustomeUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<User> users = userRepository.findUserByUserName(username);

        if(users != null && !username.isEmpty()){
            return new CustomUserDetails(users.get(0));
        }else{
             throw new UsernameNotFoundException("User Name not found");
        }


    }
}
