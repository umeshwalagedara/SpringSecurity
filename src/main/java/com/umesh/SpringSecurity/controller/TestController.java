package com.umesh.SpringSecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umesh_w on 8/18/2017.
 */


@RestController
@RequestMapping(value = "/all")
public class TestController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello";
    }


}
