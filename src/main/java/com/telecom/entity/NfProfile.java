package com.telecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NfProfile {
	@Id
	private String nfProfileId;
	
	private String ipV4Addresses;

	public String getNfProfileId() {
		return nfProfileId;
	}

	public void setNfProfileId(String nfProfileId) {
		this.nfProfileId = nfProfileId;
	}

	public String getIpV4Addresses() {
		return ipV4Addresses;
	}

	public void setIpV4Addresses(String ipV4Addresses) {
		this.ipV4Addresses = ipV4Addresses;
	}

	@Override
	public String toString() {
		return "NfProfile [nfProfileId=" + nfProfileId + ", ipV4Addresses=" + ipV4Addresses + "]";
	}
	
}
