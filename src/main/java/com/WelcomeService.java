package com;


import org.springframework.stereotype.Controller;

@Controller // this is the controller class from which the services will be provided.
public class WelcomeService {
    public String dis()
    {
        return "hello";
    }
}
