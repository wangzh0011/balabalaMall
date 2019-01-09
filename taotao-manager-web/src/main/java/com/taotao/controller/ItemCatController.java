package com.taotao.controller;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.impl.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ItemCatController {
    @Resource
    private ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping("/item/cat/list")
    public List<EasyUITreeNode> getItemCatList(@RequestParam(defaultValue = "0") long id){
       List<EasyUITreeNode> list =  itemCatService.getItemCatList(id);
       return list;
    }
}
