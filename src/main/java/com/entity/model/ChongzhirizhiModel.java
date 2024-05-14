package com.entity.model;

import com.entity.ChongzhirizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 充值日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongzhirizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 账户
     */
    private Integer youxizhanghuId;


    /**
     * 支付类型
     */
    private Integer chongzhirizhiTypes;


    /**
     * 充值金额
     */
    private Double chongzhirizhiMoney;


    /**
     * 充值时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chongzhirizhiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：账户
	 */
    public Integer getYouxizhanghuId() {
        return youxizhanghuId;
    }


    /**
	 * 设置：账户
	 */
    public void setYouxizhanghuId(Integer youxizhanghuId) {
        this.youxizhanghuId = youxizhanghuId;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getChongzhirizhiTypes() {
        return chongzhirizhiTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setChongzhirizhiTypes(Integer chongzhirizhiTypes) {
        this.chongzhirizhiTypes = chongzhirizhiTypes;
    }
    /**
	 * 获取：充值金额
	 */
    public Double getChongzhirizhiMoney() {
        return chongzhirizhiMoney;
    }


    /**
	 * 设置：充值金额
	 */
    public void setChongzhirizhiMoney(Double chongzhirizhiMoney) {
        this.chongzhirizhiMoney = chongzhirizhiMoney;
    }
    /**
	 * 获取：充值时间
	 */
    public Date getChongzhirizhiTime() {
        return chongzhirizhiTime;
    }


    /**
	 * 设置：充值时间
	 */
    public void setChongzhirizhiTime(Date chongzhirizhiTime) {
        this.chongzhirizhiTime = chongzhirizhiTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
