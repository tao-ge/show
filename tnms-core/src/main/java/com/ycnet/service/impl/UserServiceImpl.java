package com.ycnet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycnet.service.UserService;
import com.ycnet.vo.User;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

//    @Autowired
//    UserRepository userRepository;

    @Override
    public List<User> list() {
    	return null;
        //return userRepository.findAll();
    }
}