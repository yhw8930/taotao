package com.taotao.manager.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;
import com.taotao.manager.pojo.Content;


public interface ContentMapper extends Mapper<Content> {

    /**
     * 根据categoryId查询内容列表，并且按照更新时间倒序排序
     * 
     * @return
     */
     List<Content> queryContentList(Long categoryId);

}
