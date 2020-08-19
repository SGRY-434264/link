package com.edu.linkconvert.service;

import com.edu.linkconvert.entity.Link;

/**
 * @ClassName LinkService
 * @Author 赵九州
 * @Date 2020/8/19 9:39
 * @Description TODO
 */
public interface LinkService {
    String convertLink(Link link);
    String getLongUrl(String short_url);
}
