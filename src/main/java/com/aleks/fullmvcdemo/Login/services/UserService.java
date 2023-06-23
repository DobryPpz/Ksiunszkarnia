package com.aleks.fullmvcdemo.Login.services;
import com.aleks.fullmvcdemo.Login.dto.UserDto;
import com.aleks.fullmvcdemo.Login.models.User;

import java.io.UnsupportedEncodingException;

public interface UserService {

    void saveUser(UserDto userDto);
    void save(User user);
    User findUserByEmail(String email);
    void register(User user, String siteURL) throws UnsupportedEncodingException;
}
