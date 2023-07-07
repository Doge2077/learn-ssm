package com.example.controller;


import com.example.entity.Vtuber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class MainController {

    @RequestMapping("/mainpage")
    public ModelAndView mainpage () {
        return new ModelAndView("index");
    }

    @GetMapping("/vtuber")
    public ModelAndView vtuber (Vtuber vtuber) {
        System.out.println(vtuber);
        if(Objects.equals(vtuber.getName(), "hiiro")) throw new RuntimeException("下头男");
        return new ModelAndView("redirect:/mainpage");
    }

}
