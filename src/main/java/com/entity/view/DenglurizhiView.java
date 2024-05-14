package com.entity.view;

import com.entity.DenglurizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 登录日志
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("denglurizhi")
public class DenglurizhiView extends DenglurizhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 youxizhanghu
			/**
			* 游戏账户 的 用户
			*/
			private Integer youxizhanghuYonghuId;
			/**
			* ID账户
			*/
			private String youxizhanghuName;
			/**
			* 账户类型
			*/
			private Integer youxizhanghuTypes;
				/**
				* 账户类型的值
				*/
				private String youxizhanghuValue;
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

	public DenglurizhiView() {

	}

	public DenglurizhiView(DenglurizhiEntity denglurizhiEntity) {
		try {
			BeanUtils.copyProperties(this, denglurizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




				//级联表的get和set youxizhanghu

					/**
					* 获取：游戏账户 的 用户
					*/
					public Integer getYouxizhanghuYonghuId() {
						return youxizhanghuYonghuId;
					}
					/**
					* 设置：游戏账户 的 用户
					*/
					public void setYouxizhanghuYonghuId(Integer youxizhanghuYonghuId) {
						this.youxizhanghuYonghuId = youxizhanghuYonghuId;
					}


					/**
					* 获取： ID账户
					*/
					public String getYouxizhanghuName() {
						return youxizhanghuName;
					}
					/**
					* 设置： ID账户
					*/
					public void setYouxizhanghuName(String youxizhanghuName) {
						this.youxizhanghuName = youxizhanghuName;
					}

					/**
					* 获取： 账户类型
					*/
					public Integer getYouxizhanghuTypes() {
						return youxizhanghuTypes;
					}
					/**
					* 设置： 账户类型
					*/
					public void setYouxizhanghuTypes(Integer youxizhanghuTypes) {
						this.youxizhanghuTypes = youxizhanghuTypes;
					}


						/**
						* 获取： 账户类型的值
						*/
						public String getYouxizhanghuValue() {
							return youxizhanghuValue;
						}
						/**
						* 设置： 账户类型的值
						*/
						public void setYouxizhanghuValue(String youxizhanghuValue) {
							this.youxizhanghuValue = youxizhanghuValue;
						}

					/**
					* 获取： 账户资产
					*/
					public String getYouxizhanghuFile() {
						return youxizhanghuFile;
					}
					/**
					* 设置： 账户资产
					*/
					public void setYouxizhanghuFile(String youxizhanghuFile) {
						this.youxizhanghuFile = youxizhanghuFile;
					}

					/**
					* 获取： 账户创建时间
					*/
					public Date getYouxizhanghuTime() {
						return youxizhanghuTime;
					}
					/**
					* 设置： 账户创建时间
					*/
					public void setYouxizhanghuTime(Date youxizhanghuTime) {
						this.youxizhanghuTime = youxizhanghuTime;
					}



}
