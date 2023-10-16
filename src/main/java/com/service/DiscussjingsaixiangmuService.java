package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingsaixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingsaixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingsaixiangmuView;


/**
 * 竞赛项目评论表
 *
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public interface DiscussjingsaixiangmuService extends IService<DiscussjingsaixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingsaixiangmuVO> selectListVO(Wrapper<DiscussjingsaixiangmuEntity> wrapper);
   	
   	DiscussjingsaixiangmuVO selectVO(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
   	
   	List<DiscussjingsaixiangmuView> selectListView(Wrapper<DiscussjingsaixiangmuEntity> wrapper);
   	
   	DiscussjingsaixiangmuView selectView(@Param("ew") Wrapper<DiscussjingsaixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingsaixiangmuEntity> wrapper);
   	

}

