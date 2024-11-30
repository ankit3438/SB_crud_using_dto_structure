package com.DtoApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DtoApplication.dto.SaveUserDto;
import com.DtoApplication.dto.UserAddressDto;

@Service
public interface UserService {
    public List<UserAddressDto> getalluser();
    public UserAddressDto saveuser(SaveUserDto saveUserDto);
}
