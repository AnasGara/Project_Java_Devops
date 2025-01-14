package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.services.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private IClientService serviceClient;
	
	@PostMapping("/addClient")
	public Client addClient (@RequestBody Client c) {
		return serviceClient.addClient(c);
	}
}
