package com.taotao.common.pojo;

import java.util.List;

/**
 * 返回EasyUI格式的工具类
 * @Description: 
 * @Author: duyunlei
 * @Date: 2016年12月3日 下午5:33:05
 */
public class Result {

  private long total;
  private List<?> rows;
  public long getTotal() {
    return total;
  }
  public void setTotal(long total) {
    this.total = total;
  }
  public List<?> getRows() {
    return rows;
  }
  public void setRows(List<?> rows) {
    this.rows = rows;
  }
  
}
