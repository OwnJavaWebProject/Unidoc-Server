package com.sixth.unidoc.repository;

import com.sixth.unidoc.domain.GroupInfo;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<GroupInfo, Integer> {
    GroupInfo save(GroupInfo group);
}
