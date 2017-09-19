package com.shiziqiu.cloud.web.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.shiziqiu.cloud.model.User;
import com.shiziqiu.cloud.web.service.UserService;
import com.shiziqiu.cloud.web.service.UserServiceByFeign;
/**
 * 
 * @author shiziqiu
 *
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Resource
	UserServiceByFeign userSeriveFeign;
	
	@RequestMapping(value="/getAllUsers")
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userService.readUserInfo(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getUsersFeign")
	@ResponseBody
	public ResponseEntity<List<User>> getUsersFeign(){
		return new ResponseEntity<List<User>>(userSeriveFeign.getAllUsers(), HttpStatus.OK);
	}
}
