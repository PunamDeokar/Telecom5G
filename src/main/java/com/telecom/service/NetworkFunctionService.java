package com.telecom.service;

import com.telecom.entity.NetworkFunctionInstance;

public interface NetworkFunctionService {
	
	public NetworkFunctionInstance saveNetworkFunctionInstance(NetworkFunctionInstance nfinstance);
	public NetworkFunctionInstance getNetworkFunctionById(String id);
	

}
