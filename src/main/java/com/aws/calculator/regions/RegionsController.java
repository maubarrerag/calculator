package com.aws.calculator.regions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RegionsController {

    private RegionRepository repo;

    public RegionsController(RegionRepository repo){
        this.repo = repo;
    }

    @RequestMapping("/api/regions")
    public List<Region> getRegions(){
        return repo.findAll();
    }

}
