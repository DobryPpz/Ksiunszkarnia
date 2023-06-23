package com.aleks.fullmvcdemo.Login.services;
import com.aleks.fullmvcdemo.Login.dto.UserDto;
import com.aleks.fullmvcdemo.Login.models.Role;
import com.aleks.fullmvcdemo.Login.models.RoleConstants;
import com.aleks.fullmvcdemo.Login.models.User;
import com.aleks.fullmvcdemo.Login.repository.RoleRepository;
import com.aleks.fullmvcdemo.Login.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Transactional
    public void register(User user, String siteURL)
            throws UnsupportedEncodingException {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setEnabled(true);
        userRepository.save(user);

    }


    @Override
    @Transactional
    public void saveUser(UserDto userDto) {
        Role role = roleRepository.findByName(RoleConstants.Roles.USER);

        if (role == null)
            role = roleRepository.save(new Role(RoleConstants.Roles.USER));

        User user = new User(userDto.getUsername(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
                Arrays.asList(role));
        userRepository.save(user);


    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
