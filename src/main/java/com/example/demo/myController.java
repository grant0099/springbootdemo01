package com.example.demo;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grant on 2021/8/18.
 */

//@ResponseBody //這兩個類別的方法返回的數據直接給瀏覽器   (Object轉為Json數據)   可由 RestController 取代
//@Controller

@RestController
public class myController {
    @Autowired
    Person person;
    @Value("${person.last-name}")
    private String name;
    @RequestMapping("/test")
    public String test(){
        System.out.println(name);
        return "hello";
    }
}
