package com.lpf.demo.web;

import com.github.pagehelper.PageInfo;
import com.lpf.demo.dao.ZyzsUserBiMapper;
import com.lpf.demo.entity.ZyzsUserBi;
import com.lpf.demo.xml.ServiceName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class appController {

    /**
     * Service 中使用
     */
    @Resource
   private ZyzsUserBiMapper  zyzsUserBiMapper;

    @Resource
    private ServiceName ser;

    @Value(value="${server.port}")
    private String nameSer;
    @GetMapping("/get")
    public Object getAppData(HttpServletRequest request){

      //return   zyzsUserBiMapper.selectByPrimaryKey(request.getParameter("id"));
        List<ZyzsUserBi> all = zyzsUserBiMapper.findAll();

        PageInfo<ZyzsUserBi> pageInfo = new PageInfo<>(all);

        List<ZyzsUserBi> list = pageInfo.getList();
        long total = pageInfo.getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("list",list);
        map.put("total", total);

        return map;


    }


    @GetMapping("/getS")
    public Object getApp(HttpServletRequest request){


        return  ser.getName("22222")+nameSer;


    }

}
