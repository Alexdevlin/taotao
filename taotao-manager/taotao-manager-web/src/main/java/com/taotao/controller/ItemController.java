package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.Result;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

  
  @Autowired
  private ItemService itemService;
  
  @RequestMapping("/{itemId}")
  @ResponseBody
  public TbItem getItemById(@PathVariable Long itemId){
    
    TbItem item=itemService.getItemById(itemId);
    return item;
    
  }
  
  @RequestMapping("/list")
  @ResponseBody
  public Result itemList(Integer page,Integer rows){
    
    Result result= this.itemService.getItemList(page, rows);
    return result;
    
  }
  
   
  
}
