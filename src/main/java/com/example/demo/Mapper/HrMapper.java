package com.example.demo.Mapper;

import com.example.demo.Pojo.Hr;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Description: Hr信息Mapper层
 * @author: ZPX
 * @createDate: 2020/1/13 20:01
 * @version: 1.0
 */
@Mapper
public interface HrMapper {
    /**
     * 删除Hr信息
     *
     * @param hr
     * @return
     */
    int deleteByPrimaryKey(Hr hr);

    /**
     * 添加Hr信息
     *
     * @param hr
     * @return
     */
    int insertSelective(Hr hr);

    /**
     * 查询Hr信息
     *
     * @param hr
     * @return
     */
    Hr selectByPrimaryKey(Hr hr);

    /**
     * 更新Hr信息
     *
     * @param hr
     * @return
     */
    int updateByPrimaryKeySelective(Hr hr);

    /**
     * 查询全部Hr信息
     *
     * @return
     */
    List<Hr> findAll();
}