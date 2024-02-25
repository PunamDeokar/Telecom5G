package com.telecom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.entity.NetworkFunctionInstance;
import com.telecom.inceptors.RecordNotFounException;
import com.telecom.repository.NetworkFunctionRepo;
@Service
public class NetworkFunctionServiceIMPL implements NetworkFunctionService {

	@Autowired
	NetworkFunctionRepo repo;
	@Override
	public NetworkFunctionInstance saveNetworkFunctionInstance(NetworkFunctionInstance nfinstance) {
		NetworkFunctionInstance newnf = repo.save(nfinstance);
		return newnf;
	}
	@Override
	public NetworkFunctionInstance getNetworkFunctionById(String id) {
		Optional<NetworkFunctionInstance> nfinstance = repo.findById(id);
		if(nfinstance.isPresent()) {
			return nfinstance.get();
		}else {
		 new RecordNotFounException();
			
	}return null;
	
	}
}
