package com.vishal.demo;

import java.util.List;
import java.util.Map;

public class InnerMap {

	Map<String, List<Something>> somethingList;

	public InnerMap() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, List<Something>> getSomethingList() {
		return somethingList;
	}

	public void setSomethingList(Map<String, List<Something>> somethingList) {
		this.somethingList = somethingList;
	}

}
