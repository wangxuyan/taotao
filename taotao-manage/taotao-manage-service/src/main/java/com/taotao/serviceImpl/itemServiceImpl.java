package com.taotao.serviceImpl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/4.
 */
@Service
public class itemServiceImpl implements itemService {
    @Autowired
    TbItemMapper mapper;
    @Override
    public TbItem getItemById(Long itemId) {
        TbItem tbItem = mapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
