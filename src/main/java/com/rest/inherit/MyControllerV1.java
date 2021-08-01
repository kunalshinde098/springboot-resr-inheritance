package com.rest.inherit;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/mycontroller")
public class MyControllerV1 {
    
    @RequestMapping("/mymethod1")
    public Object mymethod1() {
        
        return "mymethod1";
    }
    
    @RequestMapping("/mymethod2")
    public Object mymethod2() {
    	return "mymethod2";
    }
}
