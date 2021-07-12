package qlnv.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import qlnv.dto.UserRegistrationDto;
import qlnv.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
