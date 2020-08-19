package com.edu.linkconvert.entity;

import java.io.Serializable;

/**
 * @ClassName Link
 * @Author 赵九州
 * @Date 2020/8/19 9:25
 * @Description 长短连接转换基类
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 3984476440656341409L;
    private Integer link_id;
    private String long_url;
    private String short_url;

    @Override
    public String toString() {
        return "Link{" +
                "link_id=" + link_id +
                ", long_url='" + long_url + '\'' +
                ", short_url='" + short_url + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getLink_id() {
        return link_id;
    }

    public void setLink_id(Integer link_id) {
        this.link_id = link_id;
    }

    public String getLong_url() {
        return long_url;
    }

    public void setLong_url(String long_url) {
        this.long_url = long_url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public Link(Integer link_id, String long_url, String short_url) {
        this.link_id = link_id;
        this.long_url = long_url;
        this.short_url = short_url;
    }

    public Link() {
    }

    public Link(String long_url) {
        this.long_url = long_url;
    }
}
