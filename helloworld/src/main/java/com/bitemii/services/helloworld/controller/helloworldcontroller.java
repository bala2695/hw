package com.bitemii.services.helloworld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworldcontroller {

	@RequestMapping("/")
    @ResponseBody
    String index() {
        return "Hello, World!";
    }
}
