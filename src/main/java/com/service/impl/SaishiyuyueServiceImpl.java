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


import com.dao.SaishiyuyueDao;
import com.entity.SaishiyuyueEntity;
import com.service.SaishiyuyueService;
import com.entity.vo.SaishiyuyueVO;
import com.entity.view.SaishiyuyueView;

@Service("saishiyuyueService")
public class SaishiyuyueServiceImpl extends ServiceImpl<SaishiyuyueDao, SaishiyuyueEntity> implements SaishiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishiyuyueEntity> page = this.selectPage(
                new Query<SaishiyuyueEntity>(params).getPage(),
                new EntityWrapper<SaishiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishiyuyueEntity> wrapper) {
		  Page<SaishiyuyueView> page =new Query<SaishiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishiyuyueVO> selectListVO(Wrapper<SaishiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishiyuyueVO selectVO(Wrapper<SaishiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishiyuyueView> selectListView(Wrapper<SaishiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishiyuyueView selectView(Wrapper<SaishiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
