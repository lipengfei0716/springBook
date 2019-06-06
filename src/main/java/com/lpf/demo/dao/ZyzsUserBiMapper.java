package com.lpf.demo.dao;

import com.lpf.demo.entity.ZyzsUserBi;

import java.util.List;

public interface ZyzsUserBiMapper {
    int deleteByPrimaryKey(String id);

    int insert(ZyzsUserBi record);

    int insertSelective(ZyzsUserBi record);

    ZyzsUserBi selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ZyzsUserBi record);

    int updateByPrimaryKey(ZyzsUserBi record);

    List<ZyzsUserBi> findAll();

}