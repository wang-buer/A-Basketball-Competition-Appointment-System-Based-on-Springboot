package com.dao;

import com.entity.SaishiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishiyuyueVO;
import com.entity.view.SaishiyuyueView;


/**
 * 赛事预约
 * 
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface SaishiyuyueDao extends BaseMapper<SaishiyuyueEntity> {
	
	List<SaishiyuyueVO> selectListVO(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
	
	SaishiyuyueVO selectVO(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
	
	List<SaishiyuyueView> selectListView(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);

	List<SaishiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
	
	SaishiyuyueView selectView(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
	

}
