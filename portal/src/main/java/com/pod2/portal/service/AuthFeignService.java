package com.pod2.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pod2.portal.feign.AuthenticationFeignClient;
import com.pod2.portal.vo.UserLoginCredentialVO;

@Service
public class AuthFeignService {

	@Autowired
	private AuthenticationFeignClient authclient;

	public ResponseEntity<?> getToken(UserLoginCredentialVO usercredentials) {
		return authclient.login(usercredentials);
	}

}