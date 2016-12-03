package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @Description: 
 * @Author: duyunlei
 * @Date: 2016年12月3日 下午3:56:22
 */
@Controller
public class PageController {

  @RequestMapping("/")
  public String pageList(){
    return "index";
  }
  
  @RequestMapping("/{page}")
  public String page(@PathVariable String page){
    return page;
  }
}
