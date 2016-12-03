package com.taotao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.Result;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

/**
 * 商品管理
 * @Description: 
 * @Author: duyunlei
 * @Date: 2016年12月3日 下午2:20:00
 */
@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  private TbItemMapper itemMapper;
  
  public TbItem getItemById(Long id) {
    
    TbItemExample example = new TbItemExample();
    Criteria criteria = example.createCriteria();
    criteria.andIdEqualTo(id);
    List<TbItem> list = itemMapper.selectByExample(example);
    if(list!=null && list.size()>0){
      TbItem item = list.get(0);
      return item;
    }
    return null;
  }

  /**
   * 查询商品列表
   */
  public Result getItemList(Integer page, Integer rows) {
    
    TbItemExample example = new TbItemExample();
    //进行分页
    PageHelper.startPage(page, rows);
    List<TbItem> list =itemMapper.selectByExample(example);
    //返回EasyUI格式数据
    Result result= new Result();
    result.setRows(list);
    PageInfo<TbItem> pi=new PageInfo<TbItem>(list);
    result.setTotal(pi.getTotal());
    return result;
    
  }

}
