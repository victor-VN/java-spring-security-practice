package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ResponseBody
    public String helloMessage(){


        return "Hello World";
    }
}
