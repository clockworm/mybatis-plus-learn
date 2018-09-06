package com.mybatis.plus.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.plus.entity.StoreWorkInfo;
import com.mybatis.plus.enums.AgeEnum;

@RestController
@RequestMapping("store")
public class StoreWorkController {

	@GetMapping("work")
	public String test1() {
		StoreWorkInfo workInfo = new StoreWorkInfo();
		workInfo.setUserName("tanglingyun");
		workInfo.setWorkUsername("tanglingyun");
		workInfo.setWorkNum(AgeEnum.ONE);
		workInfo.setStoreCode("B107");
		workInfo.setId("1");
		workInfo.insertOrUpdate();
		boolean deleteById = workInfo.deleteById();
		System.err.println(deleteById);
		return "String";
	}
}
