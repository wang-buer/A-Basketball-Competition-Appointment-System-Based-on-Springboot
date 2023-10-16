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


import com.dao.JingsaixiangmuDao;
import com.entity.JingsaixiangmuEntity;
import com.service.JingsaixiangmuService;
import com.entity.vo.JingsaixiangmuVO;
import com.entity.view.JingsaixiangmuView;

@Service("jingsaixiangmuService")
public class JingsaixiangmuServiceImpl extends ServiceImpl<JingsaixiangmuDao, JingsaixiangmuEntity> implements JingsaixiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaixiangmuEntity> page = this.selectPage(
                new Query<JingsaixiangmuEntity>(params).getPage(),
                new EntityWrapper<JingsaixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaixiangmuEntity> wrapper) {
		  Page<JingsaixiangmuView> page =new Query<JingsaixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaixiangmuVO> selectListVO(Wrapper<JingsaixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaixiangmuVO selectVO(Wrapper<JingsaixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaixiangmuView> selectListView(Wrapper<JingsaixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaixiangmuView selectView(Wrapper<JingsaixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
