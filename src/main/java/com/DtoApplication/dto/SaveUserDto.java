package com.DtoApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveUserDto {
    private String name;
    private String email;
    private String password;
    private String nationality;
    private String gender;
    private String street;
    private String state;
    private String country;
}
