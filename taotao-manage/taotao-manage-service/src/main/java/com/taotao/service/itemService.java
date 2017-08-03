package com.taotao.service;

import com.taotao.pojo.TbItem;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/4.
 */

public interface itemService {
    TbItem getItemById(Long itemId);
}
