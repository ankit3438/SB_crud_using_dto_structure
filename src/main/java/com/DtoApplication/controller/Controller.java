package com.DtoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DtoApplication.dto.SaveUserDto;
import com.DtoApplication.dto.UserAddressDto;
import com.DtoApplication.service.UserServiceImpl;

@RestController
public class Controller {

    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @GetMapping("/users")
    public List<UserAddressDto> get(){
        return userServiceImpl.getalluser();
    }

    @PostMapping("/users")
    public UserAddressDto saveuser(@RequestBody SaveUserDto saveUserDto){
        return userServiceImpl.saveuser(saveUserDto);
    }

}
