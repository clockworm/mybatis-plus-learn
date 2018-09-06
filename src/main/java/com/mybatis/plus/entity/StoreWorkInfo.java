package com.mybatis.plus.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.mybatis.plus.enums.AgeEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StoreWorkInfo extends Model<StoreWorkInfo> {
	private static final long serialVersionUID = 1L;

	private String id;

	private String userName;

	private AgeEnum workNum;

	private String workUsername;

	private String storeCode;

	private Date createTime;

	private Date updateTime;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}