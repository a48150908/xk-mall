package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xk
 * @email 2557876828@qq.com
 * @date 2020-12-16 17:22:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
