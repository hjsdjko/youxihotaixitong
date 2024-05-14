package com.entity.model;

import com.entity.YouxizhanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 游戏账户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YouxizhanghuModel implements Serializable {
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
     * ID账户
     */
    private String youxizhanghuName;


    /**
     * 账户类型
     */
    private Integer youxizhanghuTypes;


    /**
     * 账户资产
     */
    private String youxizhanghuFile;


    /**
     * 账户创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date youxizhanghuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：ID账户
	 */
    public String getYouxizhanghuName() {
        return youxizhanghuName;
    }


    /**
	 * 设置：ID账户
	 */
    public void setYouxizhanghuName(String youxizhanghuName) {
        this.youxizhanghuName = youxizhanghuName;
    }
    /**
	 * 获取：账户类型
	 */
    public Integer getYouxizhanghuTypes() {
        return youxizhanghuTypes;
    }


    /**
	 * 设置：账户类型
	 */
    public void setYouxizhanghuTypes(Integer youxizhanghuTypes) {
        this.youxizhanghuTypes = youxizhanghuTypes;
    }
    /**
	 * 获取：账户资产
	 */
    public String getYouxizhanghuFile() {
        return youxizhanghuFile;
    }


    /**
	 * 设置：账户资产
	 */
    public void setYouxizhanghuFile(String youxizhanghuFile) {
        this.youxizhanghuFile = youxizhanghuFile;
    }
    /**
	 * 获取：账户创建时间
	 */
    public Date getYouxizhanghuTime() {
        return youxizhanghuTime;
    }


    /**
	 * 设置：账户创建时间
	 */
    public void setYouxizhanghuTime(Date youxizhanghuTime) {
        this.youxizhanghuTime = youxizhanghuTime;
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
