package com.keysoft.onepage.controller.home;

import com.keysoft.onepage.common.IndexTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/index")
public class Index extends IndexTemplate {

    @RequestMapping(value = {"/","index"})
    public String index(){
        return "this in index";
    }

    @RequestMapping("/url")
    public String operation(){
        return  getPageURL();
    }
}
