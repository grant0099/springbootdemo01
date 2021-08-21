package com.example.demo;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;

/**
 * Created by grant on 2021/8/18.
 */

/**
 * @ImportResource(locations = {"classpath:beans.xml"}) 導入spring的配置文件   (不推薦)
 *
 */
//@ResponseBody //這兩個類別的方法返回的數據直接給瀏覽器   (Object轉為Json數據)   可由 RestController 取代
//@Controller
//@ImportResource(locations = {"classpath:beans.xml"})
@RestController
public class myController {
    @Autowired
    Person person;
//    @Autowired
//    ApplicationContext ioc;

//    @Value("${person.last-name}")
//    private String name;
    @RequestMapping("/test")
    public String test(){

//        System.out.println(ioc.containsBean("helloService"));
        System.out.println(person);
        return "hello";
    }
}
