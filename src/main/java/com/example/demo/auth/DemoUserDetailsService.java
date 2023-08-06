package com.example.demo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserAccount;
import com.example.demo.mapper.UserMapper;

@Service
public class DemoUserDetailsService implements UserDetailsService {
	@Autowired
	UserMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccount user = mapper.getAccount(username);
		if (user == null) {
			throw new UsernameNotFoundException("not found : " + username);
		}
		return (new DemoUserDetails(user));
	}

}
