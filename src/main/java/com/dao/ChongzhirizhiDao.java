package com.dao;

import com.entity.ChongzhirizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongzhirizhiView;

/**
 * 充值日志 Dao 接口
 *
 * @author 
 */
public interface ChongzhirizhiDao extends BaseMapper<ChongzhirizhiEntity> {

   List<ChongzhirizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
