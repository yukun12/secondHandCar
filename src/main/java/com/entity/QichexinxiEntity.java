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
 * 汽车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 13:12:52
 */
@TableName("qichexinxi")
public class QichexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichexinxiEntity() {
		
	}
	
	public QichexinxiEntity(T t) {
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
	 * 汽车品牌
	 */
					
	private String qichepinpai;
	
	/**
	 * 车系
	 */
					
	private String chexi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 上牌时间
	 */
					
	private String shangpaishijian;
	
	/**
	 * 表显里程
	 */
					
	private String biaoxianlicheng;
	
	/**
	 * 排放标准
	 */
					
	private String paifangbiaozhun;
	
	/**
	 * 变速箱
	 */
					
	private String biansuxiang;
	
	/**
	 * 排量
	 */
					
	private String pailiang;
	
	/**
	 * 过户
	 */
					
	private String guohu;
	
	/**
	 * 详细信息
	 */
					
	private String xiangxixinxi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：汽车品牌
	 */
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
	/**
	 * 设置：车系
	 */
	public void setChexi(String chexi) {
		this.chexi = chexi;
	}
	/**
	 * 获取：车系
	 */
	public String getChexi() {
		return chexi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：上牌时间
	 */
	public void setShangpaishijian(String shangpaishijian) {
		this.shangpaishijian = shangpaishijian;
	}
	/**
	 * 获取：上牌时间
	 */
	public String getShangpaishijian() {
		return shangpaishijian;
	}
	/**
	 * 设置：表显里程
	 */
	public void setBiaoxianlicheng(String biaoxianlicheng) {
		this.biaoxianlicheng = biaoxianlicheng;
	}
	/**
	 * 获取：表显里程
	 */
	public String getBiaoxianlicheng() {
		return biaoxianlicheng;
	}
	/**
	 * 设置：排放标准
	 */
	public void setPaifangbiaozhun(String paifangbiaozhun) {
		this.paifangbiaozhun = paifangbiaozhun;
	}
	/**
	 * 获取：排放标准
	 */
	public String getPaifangbiaozhun() {
		return paifangbiaozhun;
	}
	/**
	 * 设置：变速箱
	 */
	public void setBiansuxiang(String biansuxiang) {
		this.biansuxiang = biansuxiang;
	}
	/**
	 * 获取：变速箱
	 */
	public String getBiansuxiang() {
		return biansuxiang;
	}
	/**
	 * 设置：排量
	 */
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	/**
	 * 获取：排量
	 */
	public String getPailiang() {
		return pailiang;
	}
	/**
	 * 设置：过户
	 */
	public void setGuohu(String guohu) {
		this.guohu = guohu;
	}
	/**
	 * 获取：过户
	 */
	public String getGuohu() {
		return guohu;
	}
	/**
	 * 设置：详细信息
	 */
	public void setXiangxixinxi(String xiangxixinxi) {
		this.xiangxixinxi = xiangxixinxi;
	}
	/**
	 * 获取：详细信息
	 */
	public String getXiangxixinxi() {
		return xiangxixinxi;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
