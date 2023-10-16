package com.entity.vo;

import com.entity.JingsaixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 10:22:35
 */
public class JingsaixiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 赛事名称
	 */
	
	private String saishimingcheng;
		
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 比赛模式
	 */
	
	private String bisaimoshi;
		
	/**
	 * 赛事要求
	 */
	
	private String saishiyaoqiu;
		
	/**
	 * 比赛时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bisaishijian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 比赛地点
	 */
	
	private String bisaididian;
		
	/**
	 * 比赛详情
	 */
	
	private String bisaixiangqing;
				
	
	/**
	 * 设置：赛事名称
	 */
	 
	public void setSaishimingcheng(String saishimingcheng) {
		this.saishimingcheng = saishimingcheng;
	}
	
	/**
	 * 获取：赛事名称
	 */
	public String getSaishimingcheng() {
		return saishimingcheng;
	}
				
	
	/**
	 * 设置：项目分类
	 */
	 
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
				
	
	/**
	 * 设置：比赛模式
	 */
	 
	public void setBisaimoshi(String bisaimoshi) {
		this.bisaimoshi = bisaimoshi;
	}
	
	/**
	 * 获取：比赛模式
	 */
	public String getBisaimoshi() {
		return bisaimoshi;
	}
				
	
	/**
	 * 设置：赛事要求
	 */
	 
	public void setSaishiyaoqiu(String saishiyaoqiu) {
		this.saishiyaoqiu = saishiyaoqiu;
	}
	
	/**
	 * 获取：赛事要求
	 */
	public String getSaishiyaoqiu() {
		return saishiyaoqiu;
	}
				
	
	/**
	 * 设置：比赛时间
	 */
	 
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	
	/**
	 * 获取：比赛时间
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：比赛地点
	 */
	 
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
				
	
	/**
	 * 设置：比赛详情
	 */
	 
	public void setBisaixiangqing(String bisaixiangqing) {
		this.bisaixiangqing = bisaixiangqing;
	}
	
	/**
	 * 获取：比赛详情
	 */
	public String getBisaixiangqing() {
		return bisaixiangqing;
	}
			
}
