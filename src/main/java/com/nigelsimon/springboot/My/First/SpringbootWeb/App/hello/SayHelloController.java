package com.nigelsimon.springboot.My.First.SpringbootWeb.App.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hi guys this is Nigel Simon";
    }

    @RequestMapping("/say-hello-jsp")
    @ResponseBody
    public String sayHelloJsp(){
        return "Hi guys this is Nigel Simon From Java JSP";
    }
}
