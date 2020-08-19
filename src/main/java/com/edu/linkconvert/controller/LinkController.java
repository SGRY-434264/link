package com.edu.linkconvert.controller;

import com.edu.linkconvert.entity.Link;
import com.edu.linkconvert.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName LinkController
 * @Author 赵九州
 * @Date 2020/8/19 9:40
 * @Description TODO
 */
@Controller
public class LinkController {
    @Autowired
    private LinkService linkService;

    @ResponseBody
    @RequestMapping(value = "/link/convert",method = RequestMethod.POST)
    public String convert(@RequestBody Link link) {
        return linkService.convertLink(new Link(link.getLong_url()));
    }
    @RequestMapping(value = "/page_{short_url}")
    public String page_page(@PathVariable("short_url") String short_url) {
        String longUrl = linkService.getLongUrl(short_url);
        return "redirect:"+longUrl;
    }
}
