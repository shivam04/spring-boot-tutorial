package com.example.dtodemo.controller;

import com.example.dtodemo.dto.UserLocationDTO;
import com.example.dtodemo.service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shivam.si on 27/04/22 9:37 am
 */

@RestController
public class MappingController {
    @Autowired
    private MappingService mappingService;

    @GetMapping("/map")
    @ResponseBody
    public List<UserLocationDTO> getAllUsersLocation() {
        return mappingService.getAllUsersLocation();
    }

}
