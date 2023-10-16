package com.entity.view;

import com.entity.SaishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛事预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
@TableName("saishiyuyue")
public class SaishiyuyueView  extends SaishiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaishiyuyueView(){
	}
 
 	public SaishiyuyueView(SaishiyuyueEntity saishiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, saishiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
