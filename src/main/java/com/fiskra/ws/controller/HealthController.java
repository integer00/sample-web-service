package com.fiskra.ws.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HealthController {

    @RequestMapping(method = RequestMethod.GET, path="/health")
    @ResponseBody
    public int HealthStatus(){
        return 200;
    }



}
