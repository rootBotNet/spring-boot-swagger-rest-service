package com.scratchpad.manager;

import com.scratchpad.entity.UserDetails;
import com.scratchpad.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsManagementManagerImpl implements UserDetailsManagementManager {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public int add(UserDetails userDetails) {
        return userDetailsRepository.insert(userDetails);
    }

    @Override
    public List<UserDetails> findAll() {
        return userDetailsRepository.findAll();
    }

}
