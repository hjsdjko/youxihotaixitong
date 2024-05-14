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
 * 游戏账户
 *
 * @author 
 * @email
 */
@TableName("youxizhanghu")
public class YouxizhanghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouxizhanghuEntity() {

	}

	public YouxizhanghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * ID账户
     */
    @TableField(value = "youxizhanghu_name")

    private String youxizhanghuName;


    /**
     * 账户类型
     */
    @TableField(value = "youxizhanghu_types")

    private Integer youxizhanghuTypes;


    /**
     * 账户资产
     */
    @TableField(value = "youxizhanghu_file")

    private String youxizhanghuFile;


    /**
     * 账户创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "youxizhanghu_time")

    private Date youxizhanghuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：ID账户
	 */
    public String getYouxizhanghuName() {
        return youxizhanghuName;
    }
    /**
	 * 获取：ID账户
	 */

    public void setYouxizhanghuName(String youxizhanghuName) {
        this.youxizhanghuName = youxizhanghuName;
    }
    /**
	 * 设置：账户类型
	 */
    public Integer getYouxizhanghuTypes() {
        return youxizhanghuTypes;
    }
    /**
	 * 获取：账户类型
	 */

    public void setYouxizhanghuTypes(Integer youxizhanghuTypes) {
        this.youxizhanghuTypes = youxizhanghuTypes;
    }
    /**
	 * 设置：账户资产
	 */
    public String getYouxizhanghuFile() {
        return youxizhanghuFile;
    }
    /**
	 * 获取：账户资产
	 */

    public void setYouxizhanghuFile(String youxizhanghuFile) {
        this.youxizhanghuFile = youxizhanghuFile;
    }
    /**
	 * 设置：账户创建时间
	 */
    public Date getYouxizhanghuTime() {
        return youxizhanghuTime;
    }
    /**
	 * 获取：账户创建时间
	 */

    public void setYouxizhanghuTime(Date youxizhanghuTime) {
        this.youxizhanghuTime = youxizhanghuTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Youxizhanghu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", youxizhanghuName=" + youxizhanghuName +
            ", youxizhanghuTypes=" + youxizhanghuTypes +
            ", youxizhanghuFile=" + youxizhanghuFile +
            ", youxizhanghuTime=" + youxizhanghuTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
