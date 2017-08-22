package com.lanou.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lizhongren1 on 2017/8/21.
 */

@RestController
public class SecController {

    @RequestMapping(value = "/jsontest")
    public Map<String, String> jsontest(){

        Map<String,String> map = new HashMap<String, String>();

        map.put("msg", "获取成功!");
        map.put("code", "4004");

        return map;
    }

    // @RequestBody

    // @RequestHeader


    @RequestMapping(value = "/savedata", method = RequestMethod.POST)
    public String saveData(@RequestBody List<Map<String, String>> list){

        System.out.println(list);


        return "1111";
    }


}
