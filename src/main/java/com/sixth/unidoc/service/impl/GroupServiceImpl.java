package com.sixth.unidoc.service.impl;

import com.sixth.unidoc.domain.GroupInfo;
import com.sixth.unidoc.repository.GroupRepository;
import com.sixth.unidoc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "groupService")
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Override
    public GroupInfo save(GroupInfo group) {
        return groupRepository.save(group);
    }
}
