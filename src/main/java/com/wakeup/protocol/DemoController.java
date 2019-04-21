package com.wakeup.protocol;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Alon
 * @Date 2019/4/19 21:04
 */
@RestController
public class DemoController {


    @RequestMapping(value = "/ssl/test")
    public String getMessage(){
        return "this is a SSL connection";
    }


    @RequestMapping(value = "/normal")
    public String getNormalMessage(){
        return "this is a http connection";
    }
}
