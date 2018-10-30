package com.taotao.web.controller;


import com.taotao.manager.pojo.ItemDesc;
import com.taotao.manager.pojo.ItemParamItem;
import com.taotao.web.bean.Item;
import com.taotao.web.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "{itemId}",method = RequestMethod.GET)
    public ModelAndView itemDetail(@PathVariable("itemId")Long itemId){
        ModelAndView modelAndView = new ModelAndView("item");
        //设置数据模型
        Item item = this.itemService.queryById(itemId);
        modelAndView.addObject("item",item);
        //商品描述数据
        ItemDesc itemDesc = this.itemService.queryDescByItemId(itemId);
        modelAndView.addObject("itemDesc",itemDesc);
        //商品参数数据
        String itemParam = this.itemService.queryItemParamItemByItemId(itemId);
        modelAndView.addObject("itemParam",itemParam);
        return modelAndView;
    }
}
