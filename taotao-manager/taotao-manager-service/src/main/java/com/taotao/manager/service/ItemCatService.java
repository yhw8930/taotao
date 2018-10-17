package com.taotao.manager.service;

import com.github.abel533.mapper.Mapper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatService extends BaseService<ItemCat>{
    /*@Autowired
    private ItemCatMapper itemCatMapper;*/

    /*public List<ItemCat> queryItemCatListByParentId(Long parentId) {
        ItemCat record = new ItemCat();
        record.setParentId(parentId);
        return this.itemCatMapper.select(record);
    }*/

    /*@Override
    public Mapper<ItemCat> getMapper() {
        return this.itemCatMapper;
    }*/
}
