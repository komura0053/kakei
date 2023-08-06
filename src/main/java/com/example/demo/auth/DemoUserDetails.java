package com.example.demo.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entity.UserAccount;

public class DemoUserDetails implements UserDetails {
	private final UserAccount user ;
	
	public DemoUserDetails(UserAccount user) {
		this.user =user;		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getPassword() {
		return this.user.password();
	}

	@Override
	public String getUsername() {
		return this.user.userName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
