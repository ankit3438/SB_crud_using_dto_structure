package com.DtoApplication.dto;

import com.DtoApplication.model.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressDto {
    private String name;
    private String email;
    private String gender;
    private Address address;
}
