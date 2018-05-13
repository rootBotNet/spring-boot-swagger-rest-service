package com.scratchpad.manager;

import com.scratchpad.entity.UserDetails;

import java.util.List;

public interface UserDetailsManagementManager {

    public int add(UserDetails userDetails);

    public List<UserDetails> findAll();

}
