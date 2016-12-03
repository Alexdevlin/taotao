package com.taotao.service;


import com.taotao.common.pojo.Result;
import com.taotao.pojo.TbItem;

/**
 * 商品管理
 * @Description: 
 * @Author: duyunlei
 * @Date: 2016年12月3日 下午2:01:31
 */
public interface ItemService {

  TbItem getItemById(Long id);

  Result getItemList(Integer page, Integer rows);
}
