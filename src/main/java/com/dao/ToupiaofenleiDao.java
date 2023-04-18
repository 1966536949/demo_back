package com.dao;

import com.entity.ToupiaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaofenleiVO;
import com.entity.view.ToupiaofenleiView;


/**
 * 投票分类
 * 
 * @author 
 * @email 
 * @date 2022-03-25 19:57:55
 */
public interface ToupiaofenleiDao extends BaseMapper<ToupiaofenleiEntity> {
	
	List<ToupiaofenleiVO> selectListVO(@Param("ew") Wrapper<ToupiaofenleiEntity> wrapper);
	
	ToupiaofenleiVO selectVO(@Param("ew") Wrapper<ToupiaofenleiEntity> wrapper);
	
	List<ToupiaofenleiView> selectListView(@Param("ew") Wrapper<ToupiaofenleiEntity> wrapper);

	List<ToupiaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaofenleiEntity> wrapper);
	
	ToupiaofenleiView selectView(@Param("ew") Wrapper<ToupiaofenleiEntity> wrapper);
	

}
