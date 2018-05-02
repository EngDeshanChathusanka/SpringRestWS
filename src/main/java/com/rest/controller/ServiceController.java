package com.rest.controller;


import com.rest.Person;
import com.rest.component.IPersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.RemoteException;

@RestController
@RequestMapping("/data")
public class ServiceController {

    @RequestMapping("/detail")
    public String getPersonDetail(
            @RequestParam(value = "name",required = false, defaultValue = "0") String name)
    {
        return name;
    }
}