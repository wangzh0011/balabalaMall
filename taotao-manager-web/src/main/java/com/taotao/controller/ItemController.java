package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.impl.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemid}")
    @ResponseBody
    public TbItem getTbItem(@PathVariable long itemid){
        TbItem tbItem = itemService.getItemById(itemid);
        return tbItem;
    }
}
