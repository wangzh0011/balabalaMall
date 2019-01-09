package com.taotao.impl;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
    public TbItem getItemById(long id);
    public EasyUIDataGridResult getItemList(int page,int rows);
}
