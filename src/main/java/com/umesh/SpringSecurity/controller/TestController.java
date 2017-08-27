package com.umesh.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umesh_w on 8/18/2017.
 */


@RestController
@RequestMapping(value = "/all")
public class TestController {


    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value = "/secure/test", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello secure";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHello2(){
        return "Hello";
    }


}
