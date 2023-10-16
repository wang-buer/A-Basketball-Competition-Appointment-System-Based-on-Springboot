package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjingsaixiangmuDao;
import com.entity.DiscussjingsaixiangmuEntity;
import com.service.DiscussjingsaixiangmuService;
import com.entity.vo.DiscussjingsaixiangmuVO;
import com.entity.view.DiscussjingsaixiangmuView;

@Service("discussjingsaixiangmuService")
public class DiscussjingsaixiangmuServiceImpl extends ServiceImpl<DiscussjingsaixiangmuDao, DiscussjingsaixiangmuEntity> implements DiscussjingsaixiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingsaixiangmuEntity> page = this.selectPage(
                new Query<DiscussjingsaixiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussjingsaixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingsaixiangmuEntity> wrapper) {
		  Page<DiscussjingsaixiangmuView> page =new Query<DiscussjingsaixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingsaixiangmuVO> selectListVO(Wrapper<DiscussjingsaixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingsaixiangmuVO selectVO(Wrapper<DiscussjingsaixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingsaixiangmuView> selectListView(Wrapper<DiscussjingsaixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingsaixiangmuView selectView(Wrapper<DiscussjingsaixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
