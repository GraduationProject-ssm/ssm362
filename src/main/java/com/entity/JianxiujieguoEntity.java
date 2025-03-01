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
 * 检修结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
@TableName("jianxiujieguo")
public class JianxiujieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianxiujieguoEntity() {
		
	}
	
	public JianxiujieguoEntity(T t) {
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
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
	/**
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
	/**
	 * 检修情况
	 */
					
	private String jianxiuqingkuang;
	
	/**
	 * 检修工结果
	 */
					
	private String jianxiugongjieguo;
	
	/**
	 * 检修日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianxiuriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
	/**
	 * 设置：设备名称
	 */
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
	/**
	 * 设置：检修情况
	 */
	public void setJianxiuqingkuang(String jianxiuqingkuang) {
		this.jianxiuqingkuang = jianxiuqingkuang;
	}
	/**
	 * 获取：检修情况
	 */
	public String getJianxiuqingkuang() {
		return jianxiuqingkuang;
	}
	/**
	 * 设置：检修工结果
	 */
	public void setJianxiugongjieguo(String jianxiugongjieguo) {
		this.jianxiugongjieguo = jianxiugongjieguo;
	}
	/**
	 * 获取：检修工结果
	 */
	public String getJianxiugongjieguo() {
		return jianxiugongjieguo;
	}
	/**
	 * 设置：检修日期
	 */
	public void setJianxiuriqi(Date jianxiuriqi) {
		this.jianxiuriqi = jianxiuriqi;
	}
	/**
	 * 获取：检修日期
	 */
	public Date getJianxiuriqi() {
		return jianxiuriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
