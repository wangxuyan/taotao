package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    itemService service;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable(value="itemId") Long itemId){
        TbItem item = service.getItemById(itemId);
        return item;
    }
}
