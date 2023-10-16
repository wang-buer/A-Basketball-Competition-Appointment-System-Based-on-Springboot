package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaixiangmuView;


/**
 * 竞赛项目
 *
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface JingsaixiangmuService extends IService<JingsaixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaixiangmuVO> selectListVO(Wrapper<JingsaixiangmuEntity> wrapper);
   	
   	JingsaixiangmuVO selectVO(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
   	
   	List<JingsaixiangmuView> selectListView(Wrapper<JingsaixiangmuEntity> wrapper);
   	
   	JingsaixiangmuView selectView(@Param("ew") Wrapper<JingsaixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaixiangmuEntity> wrapper);
   	

}

