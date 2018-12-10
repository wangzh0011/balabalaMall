package com.taotao.service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long id) {
        TbItem item = tbItemMapper.selectByPrimaryKey(id);
        return item;
    }
}
