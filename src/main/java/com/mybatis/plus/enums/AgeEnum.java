package com.mybatis.plus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import lombok.Getter;

@Getter
public enum AgeEnum implements IEnum<String> {
	ONE(1, "一岁"), 
	TWO(2, "二岁");

	private Integer code;
	private String desc;

	AgeEnum(final Integer code, final String desc) {
		this.code = code;
		this.desc = desc;
	}

	@Override
	public String getValue() {
		return this.desc;
	}
}