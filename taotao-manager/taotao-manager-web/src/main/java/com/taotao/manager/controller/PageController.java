package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 通用页面跳转
 */
@Controller
@RequestMapping("page")
public class PageController {
    /**
     * 具体的页面跳转逻辑
     * @param pageName
     * @return pageName
     */
    @RequestMapping(value = "{pageName}",method = RequestMethod.GET)
    public String toPage(@PathVariable("pageName")String pageName){
        return pageName;
    }
}
