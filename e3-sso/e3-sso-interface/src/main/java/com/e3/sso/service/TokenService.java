package com.e3.sso.service;

import com.e3.common.utils.E3Result;

public interface TokenService {
	E3Result getUserByToken(String token);
}
