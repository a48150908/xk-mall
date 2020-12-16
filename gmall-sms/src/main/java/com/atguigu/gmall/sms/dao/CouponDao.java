package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xk
 * @email 2557876828@qq.com
 * @date 2020-12-16 18:50:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
