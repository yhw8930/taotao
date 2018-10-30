package com.taotao.web.controller;

import com.taotao.web.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("index")
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 首页
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        //首页大广告
        String indexAD1 = this.indexService.queryIndexAD1();
        modelAndView.addObject("indexAD1",indexAD1);
        //右上角广告
        String indexAD2 = this.indexService.queryIndexAD2();
        modelAndView.addObject("indexAD2",indexAD2);
        return modelAndView;
    }
}
