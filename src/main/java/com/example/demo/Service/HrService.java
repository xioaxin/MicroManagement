package com.example.demo.Service;

import com.example.demo.Pojo.Hr;

import java.util.List;

/**
 * @Description: Hr信息管理逻辑层
 * @author: ZPX
 * @createDate: 2020/1/14 12:25
 * @version: 1.0
 */
public interface HrService {
    /**
     * 判断hr登录
     *
     * @param hr
     * @return
     */
    boolean checkLogin(Hr hr);

    /**
     * 查询Hr信息
     *
     * @param hr
     * @return
     */
    Hr selectHr(Hr hr);

    /**
     * 删除Hr信息
     *
     * @param hr
     * @return
     */
    int deleteHr(Hr hr);

    /**
     * 更新Hr信息
     *
     * @param hr
     * @return
     */
    int updateHr(Hr hr);

    /**
     * 查询全部Hr信息
     *
     * @return
     */
    List<Hr> findAll();


}




