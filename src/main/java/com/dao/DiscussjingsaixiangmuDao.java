package com.dao;

import com.entity.DiscussjingsaixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingsaixiangmuVO;
import com.entity.view.DiscussjingsaixiangmuView;


/**
 * 竞赛项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface DiscussjingsaixiangmuDao extends BaseMapper<DiscussjingsaixiangmuEntity> {
	
	List<DiscussjingsaixiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
	
	DiscussjingsaixiangmuVO selectVO(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
	
	List<DiscussjingsaixiangmuView> selectListView(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);

	List<DiscussjingsaixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
	
	DiscussjingsaixiangmuView selectView(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
	

}
