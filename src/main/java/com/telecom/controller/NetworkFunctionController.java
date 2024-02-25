package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.entity.NetworkFunctionInstance;
import com.telecom.service.NetworkFunctionServiceIMPL;
import com.telecom.util.MappingValues;

@RestController
@RequestMapping(value = MappingValues.save_Uri)
public class NetworkFunctionController {

	@Autowired
	NetworkFunctionServiceIMPL service;

	// @PostMapping("/post")
	@PostMapping(value = MappingValues.Post_Uri)
	public NetworkFunctionInstance saveNetworkFunctionInstance(@RequestBody NetworkFunctionInstance nfinstance) {
		return service.saveNetworkFunctionInstance(nfinstance);
	}

	// @GetMapping("/getById/{id}/")
	@GetMapping(value = MappingValues.get_Uri)
	public NetworkFunctionInstance getNetworkFunctionById(@PathVariable("id") String id) {
		return service.getNetworkFunctionById(id);
	}
}
