package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.UserAccount;


@Mapper
public interface UserMapper {
	public UserAccount getAccount(String userName);
}
