package com.aleks.fullmvcdemo.Login.services;
import com.aleks.fullmvcdemo.Login.models.User;
import com.aleks.fullmvcdemo.Login.dto.UserDto;
import java.io.UnsupportedEncodingException;

public interface UserService {

    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    void register(User user, String siteURL) throws UnsupportedEncodingException;
}
