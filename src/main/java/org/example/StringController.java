package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringController {
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value="/hello.string")
    String hello(){
        return "Hello from spring";
    }
}
