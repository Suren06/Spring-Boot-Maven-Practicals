package com.api.serviceImpl;

import com.api.common.MapperService;
import com.api.dto.UserDto;
import com.api.model.User;
import com.api.repository.UserRepository;
import com.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private MapperService mapper;

    public UserDto insertUser(UserDto userDto){
        User newUser = mapper.map(userDto, User.class);
        newUser = userRepository.save(newUser);
        return mapper.map(newUser, UserDto.class);
    }
}
