package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

	private AccountService accountService;
	@GetMapping(path = "/users")
	public List<AppUser> appUsers(){
		return accountService.listUsers();
	}
}
