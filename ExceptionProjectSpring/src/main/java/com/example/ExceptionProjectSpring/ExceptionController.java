package com.example.ExceptionProjectSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @GetMapping("/excep/{id}")
    public String checkError( @PathVariable int id) throws Exception {
        if(id==1)
        {
          throw  new Exception();
        }
        else {
            return "error";
        }
    }
}
