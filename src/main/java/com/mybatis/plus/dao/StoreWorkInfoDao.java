package com.mybatis.plus.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.plus.entity.StoreWorkInfo;

@Mapper
public interface StoreWorkInfoDao extends BaseMapper<StoreWorkInfo> {
	
	int deleteByPrimaryKey(String id);

	int insertSelective(StoreWorkInfo record);

	StoreWorkInfo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(StoreWorkInfo record);

	int updateByPrimaryKey(StoreWorkInfo record);
}