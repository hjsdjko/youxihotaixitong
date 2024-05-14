package com.entity.vo;

import com.entity.ChongzhirizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 充值日志
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongzhirizhi")
public class ChongzhirizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 账户
     */

    @TableField(value = "youxizhanghu_id")
    private Integer youxizhanghuId;


    /**
     * 支付类型
     */

    @TableField(value = "chongzhirizhi_types")
    private Integer chongzhirizhiTypes;


    /**
     * 充值金额
     */

    @TableField(value = "chongzhirizhi_money")
    private Double chongzhirizhiMoney;


    /**
     * 充值时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chongzhirizhi_time")
    private Date chongzhirizhiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：账户
	 */
    public Integer getYouxizhanghuId() {
        return youxizhanghuId;
    }


    /**
	 * 获取：账户
	 */

    public void setYouxizhanghuId(Integer youxizhanghuId) {
        this.youxizhanghuId = youxizhanghuId;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getChongzhirizhiTypes() {
        return chongzhirizhiTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setChongzhirizhiTypes(Integer chongzhirizhiTypes) {
        this.chongzhirizhiTypes = chongzhirizhiTypes;
    }
    /**
	 * 设置：充值金额
	 */
    public Double getChongzhirizhiMoney() {
        return chongzhirizhiMoney;
    }


    /**
	 * 获取：充值金额
	 */

    public void setChongzhirizhiMoney(Double chongzhirizhiMoney) {
        this.chongzhirizhiMoney = chongzhirizhiMoney;
    }
    /**
	 * 设置：充值时间
	 */
    public Date getChongzhirizhiTime() {
        return chongzhirizhiTime;
    }


    /**
	 * 获取：充值时间
	 */

    public void setChongzhirizhiTime(Date chongzhirizhiTime) {
        this.chongzhirizhiTime = chongzhirizhiTime;
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

}
