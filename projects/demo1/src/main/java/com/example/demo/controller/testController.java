package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("demo")
public class testController {

    @RequestMapping("test1/{id}")
    @ResponseBody
    public String getTest(@PathVariable("id") String id){
        return id;
    }
}
