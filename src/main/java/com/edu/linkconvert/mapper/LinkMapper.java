package com.edu.linkconvert.mapper;

import com.edu.linkconvert.entity.Link;

/**
 * @ClassName LinkMapper
 * @Author 赵九州
 * @Date 2020/8/19 9:29
 * @Description 连接转换DTO
 */
public interface LinkMapper {
    int addLink(Link link);
    Link getLongLink(String short_url);
}
