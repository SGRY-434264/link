package com.edu.linkconvert.service.iml;

import com.edu.linkconvert.entity.Link;
import com.edu.linkconvert.mapper.LinkMapper;
import com.edu.linkconvert.service.LinkService;
import com.edu.linkconvert.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName LinkServiceImpl
 * @Author 赵九州
 * @Date 2020/8/19 9:40
 * @Description TODO
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {
    @Autowired
    private  LinkMapper linkMapper;
    @Override
    public String convertLink(Link link) {
        String long_url = link.getLong_url();
        String s = new StringBuilder().append(System.currentTimeMillis()).append(long_url).toString();
        String encrypt = MD5Util.encrypt(s);
        link.setShort_url(encrypt.substring(0, 6));
        linkMapper.addLink(link);
        return link.getShort_url();
    }

    @Override
    public String getLongUrl(String short_url) {
        return linkMapper.getLongLink(short_url).getLong_url();
    }
}
