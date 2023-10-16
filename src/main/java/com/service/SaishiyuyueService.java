package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishiyuyueView;


/**
 * 赛事预约
 *
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface SaishiyuyueService extends IService<SaishiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishiyuyueVO> selectListVO(Wrapper<SaishiyuyueEntity> wrapper);
   	
   	SaishiyuyueVO selectVO(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
   	
   	List<SaishiyuyueView> selectListView(Wrapper<SaishiyuyueEntity> wrapper);
   	
   	SaishiyuyueView selectView(@Param("ew") Wrapper<SaishiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishiyuyueEntity> wrapper);
   	

}

