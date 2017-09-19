package com.shiziqiu.cloud.web.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shiziqiu.cloud.model.User;
/**
 * @author shiziqiu
 *
 */
@Component
public class UserServiceByFeignImpl implements UserServiceByFeign{

	@Override
	public List<User> getAllUsers() {
		return new ArrayList<User>();
	}

}
