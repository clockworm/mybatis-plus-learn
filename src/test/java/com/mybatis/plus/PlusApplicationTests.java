package com.mybatis.plus;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.plus.dao.StoreWorkInfoDao;
import com.mybatis.plus.entity.StoreWorkInfo;
import com.mybatis.plus.enums.AgeEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlusApplicationTests {

	@Autowired
	private StoreWorkInfoDao dao;

	@Test
	public void contextLoads() {

		StoreWorkInfo workInfo = new StoreWorkInfo();
		workInfo.setUserName("tanglingyun2");
		workInfo.setWorkUsername("tanglingyun2");
		workInfo.setWorkNum(AgeEnum.ONE);
		workInfo.setStoreCode("B107");
		workInfo.insert();

		StoreWorkInfo info = new StoreWorkInfo();
		List<StoreWorkInfo> list = info.selectAll();
		System.err.println(ToStringBuilder.reflectionToString(list));

		StoreWorkInfo info2 = dao.selectById("2");
		System.err.println(info2);

		StoreWorkInfo info3 = dao.selectByPrimaryKey("2");
		System.err.println(info3);
		QueryWrapper<StoreWorkInfo> eq = new QueryWrapper<StoreWorkInfo>().eq("user_name", "tanglingyun2").eq("id","ced39ffb0d464415a538944648797eeb");
		IPage<StoreWorkInfo> iPage = dao.selectPage(new Page<StoreWorkInfo>(1, 10), eq);
		System.err.println(ToStringBuilder.reflectionToString(iPage));

	}

}
