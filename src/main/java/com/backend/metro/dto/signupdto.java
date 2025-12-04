package com.backend.metro.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class signupdto {
    
    public String username;
    public String password;
    public String firstName;
    public String lastName;
    public String confirmPassword;
    public String email;
    public String phone;
    public String address;
    public String city;
    public String state;
    public String pincode;
    public String country;
    public String role;
    public String dob;
}
