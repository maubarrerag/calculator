package com.aws.calculator.os;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OSController {
    private OSRepository repo;

    public OSController(OSRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/api/oss")
    public List<OS> getOS(){
        return repo.findAll();
    }
}
