package com.piggy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        // 创建ModelAndView对象, 指定页面名称
        ModelAndView modelAndView = new ModelAndView("index");
        // 获取Model
        Map<String, Object> model = modelAndView.getModel();
        // 添加数据
        model.put("msg", "hello world!");

        return modelAndView;
    }
}
