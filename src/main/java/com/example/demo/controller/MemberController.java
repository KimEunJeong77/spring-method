package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("/index");
        return mv;
    }

    @GetMapping("/get")
    public String getMethod(){ return "get"; }

    @PostMapping("/post")
    public String postMethod(){ return "post"; }

    @PutMapping("/put")
    public String putMethod(){ return "put"; }

    @DeleteMapping("/delete")
    public String deleteMethod(){ return "delete"; }
}