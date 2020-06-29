package com.vishal.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public Map<String, Map<String,List<Something>>> hello() {
		
		InnerMap innerObjectMap = new InnerMap();
		
		Something something = new Something();
		something.setString("This is string");
		List<Something> somethingList = new ArrayList<>();
		Map<String, List<Something>> innerMap = new HashMap<>();
		Map<String, Map<String, List<Something>>> outerMap = new HashMap<>();

		somethingList.add(something);
		innerMap.put("list", somethingList);
		innerObjectMap.setSomethingList(innerMap);
		return null;

	}

	/*
	@RequestMapping(value="/country/{countryId}",method = RequestMethod.GET)
	public String hello3(@ApiParam(name="countryId", value="country id", required = true) @PathVariable(required = true) Integer countryId){
		return null;
	}*/
/*	
	@GetMapping("/hello2")
	public Map<String, List<Something>> hello2() {
		Something something = new Something();
		something.setString("This is string");
		List<Something> somethingList = new ArrayList<>();
		Map<String, List<Something>> innerMap = new HashMap<>();

		somethingList.add(something);
		innerMap.put("list", somethingList);

		return innerMap;

	}

	@GetMapping("/h3")
	public Map<String,Map<String,String>> test(){
		return null;
	}
	*/
}
