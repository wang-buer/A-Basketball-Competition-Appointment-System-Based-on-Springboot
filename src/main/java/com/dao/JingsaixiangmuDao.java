package com.dao;

import com.entity.JingsaixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaixiangmuVO;
import com.entity.view.JingsaixiangmuView;


/**
 * 竞赛项目
 * 
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface JingsaixiangmuDao extends BaseMapper<JingsaixiangmuEntity> {
	
	List<JingsaixiangmuVO> selectListVO(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
	
	JingsaixiangmuVO selectVO(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
	
	List<JingsaixiangmuView> selectListView(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);

	List<JingsaixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
	
	JingsaixiangmuView selectView(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
	

}
