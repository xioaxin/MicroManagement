package com.example.demo.ServiceImpl;

import com.example.demo.Mapper.HrMapper;
import com.example.demo.Pojo.Hr;
import com.example.demo.Service.HrService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: Hr信息业务逻辑层实现
 * @author: ZPX
 * @createDate: 2020/1/14 12:44
 * @version: 1.0
 */
@Service
public class HrServiceImpl implements HrService {
    @Resource
    private HrMapper hrMapper;

    @Override
    public boolean checkLogin(Hr hr) {
        return (hr.equals(hrMapper.selectByPrimaryKey(hr).getPassword()));
    }

    @Override
    public Hr selectHr(Hr hr) {
        return hrMapper.selectByPrimaryKey(hr);
    }

    @Override
    public int deleteHr(Hr hr) {
        return hrMapper.deleteByPrimaryKey(hr);
    }

    @Override
    public int updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }

    @Override
    public List<Hr> findAll() {
        return hrMapper.findAll();
    }
}




