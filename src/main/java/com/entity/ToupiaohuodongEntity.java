package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 投票活动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-25 19:57:55
 */
@TableName("toupiaohuodong")
public class ToupiaohuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ToupiaohuodongEntity() {
		
	}
	
	public ToupiaohuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投票名称
	 */
					
	private String toupiaomingcheng;
	
	/**
	 * 投票图片
	 */
					
	private String toupiaotupian;
	
	/**
	 * 投票分类
	 */
					
	private String toupiaofenlei;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 票数
	 */
					
	private Integer piaoshu;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投票名称
	 */
	public void setToupiaomingcheng(String toupiaomingcheng) {
		this.toupiaomingcheng = toupiaomingcheng;
	}
	/**
	 * 获取：投票名称
	 */
	public String getToupiaomingcheng() {
		return toupiaomingcheng;
	}
	/**
	 * 设置：投票图片
	 */
	public void setToupiaotupian(String toupiaotupian) {
		this.toupiaotupian = toupiaotupian;
	}
	/**
	 * 获取：投票图片
	 */
	public String getToupiaotupian() {
		return toupiaotupian;
	}
	/**
	 * 设置：投票分类
	 */
	public void setToupiaofenlei(String toupiaofenlei) {
		this.toupiaofenlei = toupiaofenlei;
	}
	/**
	 * 获取：投票分类
	 */
	public String getToupiaofenlei() {
		return toupiaofenlei;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：票数
	 */
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
