package com.dao;

import com.entity.ToupiaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaojiluVO;
import com.entity.view.ToupiaojiluView;


/**
 * 投票记录
 * 
 * @author 
 * @email 
 * @date 2022-03-25 19:57:55
 */
public interface ToupiaojiluDao extends BaseMapper<ToupiaojiluEntity> {
	
	List<ToupiaojiluVO> selectListVO(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
	
	ToupiaojiluVO selectVO(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
	
	List<ToupiaojiluView> selectListView(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);

	List<ToupiaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
	
	ToupiaojiluView selectView(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
}
