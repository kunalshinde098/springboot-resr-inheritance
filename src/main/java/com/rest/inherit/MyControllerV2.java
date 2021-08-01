package com.rest.inherit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/mycontroller")
public class MyControllerV2 extends MyControllerV1 {
	
	 @RequestMapping("/mymethod1")
	    public Object mymethod1() {
	        
	        return "v2.mymethod1";
	    }
    

}
