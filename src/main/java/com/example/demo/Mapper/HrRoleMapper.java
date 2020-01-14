package com.example.demo.Mapper;

import com.example.demo.Pojo.HrRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: Hr角色信息Mapper层
 * @author: ZPX
 * @createDate: 2020/1/13 20:01
 * @version: 1.0
 */
@Mapper
public interface HrRoleMapper {
    /**
     * 删除Hr角色表信息
     * @param hrRole
     * @return
     */
    int deleteByPrimaryKey(HrRole hrRole);

    /**
     * 添加Hr角色表信息
     * @param record
     * @return
     */
    int insertSelective(HrRole record);
    HrRole selectByPrimaryKey(HrRole hrRole);
    int updateByPrimaryKeySelective(HrRole record);
}