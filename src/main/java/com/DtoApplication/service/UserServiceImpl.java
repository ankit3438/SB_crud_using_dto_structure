package com.DtoApplication.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DtoApplication.dto.SaveUserDto;
import com.DtoApplication.dto.UserAddressDto;
import com.DtoApplication.model.Address;
import com.DtoApplication.model.User;
import com.DtoApplication.repository.AddressRepository;
import com.DtoApplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<UserAddressDto> getalluser() {
        List<User> users= userRepository.findAll();
        List<UserAddressDto> userAddressDtos= users.stream().map(user-> new UserAddressDto(user.getName(),user.getEmail(),user.getGender(),user.getAddress())).collect(Collectors.toList());
        return  userAddressDtos;
    }

    @Override
    public UserAddressDto saveuser(SaveUserDto saveUserDto) {
        User user=new User();
        Address address =new Address();
        //saving address from coming dto
        address.setState(saveUserDto.getState());
        address.setCountry(saveUserDto.getCountry());
        address.setStreet(saveUserDto.getStreet()); 
        addressRepository.save(address);

        //save user data from coming dto 
        user.setEmail(saveUserDto.getEmail());
        user.setGender(saveUserDto.getGender());
        user.setNationality(saveUserDto.getNationality());
        user.setName(saveUserDto.getName());
        user.setPassword(saveUserDto.getPassword());
        user.setAddress(address);
        userRepository.save(user);

        //now we have to send dto also to server which contains filtered data from saveuserdta data
        UserAddressDto userAddressDtos= new UserAddressDto(
            user.getName(),
            user.getEmail(),
            user.getGender(),
            user.getAddress()
        );
        
        return userAddressDtos;
    }

}
