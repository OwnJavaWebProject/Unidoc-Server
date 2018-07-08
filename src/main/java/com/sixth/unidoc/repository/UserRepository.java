package com.sixth.unidoc.repository;

import com.sixth.unidoc.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    @SuppressWarnings("unchecked")
    User save(User user);

    User findByUsername(String username);
}
