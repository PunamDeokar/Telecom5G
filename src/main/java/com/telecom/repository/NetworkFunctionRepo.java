package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.entity.NetworkFunctionInstance;

@Repository
public interface NetworkFunctionRepo extends JpaRepository<NetworkFunctionInstance, String> {

	// Comments
}