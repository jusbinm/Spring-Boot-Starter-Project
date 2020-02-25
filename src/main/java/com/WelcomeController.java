package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @Autowired // finds the dependency and injects in this reference
    private WelcomeService service;

    @RequestMapping("/welcome") // it will return for the request welcome eg:http://localhost:8080/welcome
    public String disp()
    {
        return service.dis(); //returning from the controller
    }
}
