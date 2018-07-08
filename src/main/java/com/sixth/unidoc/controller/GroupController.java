package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.GroupInfo;
import com.sixth.unidoc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GroupController {

    @Autowired
    GroupService groupService;

    @PostMapping("/addgroup")
    public String addgroup(GroupInfo group) {
        groupService.save(group);
        return "daohang";
    }
}
