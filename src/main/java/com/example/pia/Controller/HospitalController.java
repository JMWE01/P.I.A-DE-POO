package com.example.pia.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HospitalController {
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> holaMundo() {
        return new ResponseEntity("Hostpital", HttpStatus.OK);
    }
}
