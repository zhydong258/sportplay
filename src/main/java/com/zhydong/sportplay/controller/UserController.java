package com.zhydong.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.zhydong.sportplay.bean.QueryInfo;
import com.zhydong.sportplay.bean.User;
import com.zhydong.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao udao;

    @RequestMapping("/alluser")
    public String getUserList(QueryInfo queryInfo) {
        // 获取最大列表数
        int numbers = udao.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();

        List<User> users = udao.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers", numbers);
        res.put("data", users);
        String res_string = JSON.toJSONString(res);
        return res_string;
    }
}
