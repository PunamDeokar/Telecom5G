package com.telecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class NetworkFunctionInstance {
	@Id
	private String NetworkFunctionInstanceId;
	
	@Enumerated(EnumType.STRING)
	private NetworkFunctionInstanceType type;
	
	@Enumerated(EnumType.STRING)
	private NfStatus status;
	
	private int heartBeatTimer;
	
	private NfProfile nfProfile;

	public String getNetworkFunctionInstanceId() {
		return NetworkFunctionInstanceId;
	}

	public void setNetworkFunctionInstanceId(String networkFunctionInstanceId) {
		NetworkFunctionInstanceId = networkFunctionInstanceId;
	}

	public NetworkFunctionInstanceType getType() {
		return type;
	}

	public void setType(NetworkFunctionInstanceType type) {
		this.type = type;
	}

	public NfStatus getStatus() {
		return status;
	}

	public void setStatus(NfStatus status) {
		this.status = status;
	}

	public int getHeartBeatTimer() {
		return heartBeatTimer;
	}

	public void setHeartBeatTimer(int heartBeatTimer) {
		this.heartBeatTimer = heartBeatTimer;
	}

	public NfProfile getNfProfile() {
		return nfProfile;
	}

	public void setNfProfile(NfProfile nfProfile) {
		this.nfProfile = nfProfile;
	}

	@Override
	public String toString() {
		return "NetworkFunctionInstance [NetworkFunctionInstanceId=" + NetworkFunctionInstanceId + ", type=" + type
				+ ", status=" + status + ", heartBeatTimer=" + heartBeatTimer + ", nfProfile=" + nfProfile + "]";
	}
	
	

}