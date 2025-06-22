package com.github.kmu_wink.domain.user.repository;

import com.github.kmu_wink.domain.user.schema.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    boolean existsBySocialId(String socialId);

    List<User> findAllByNameContaining(String name);

    Optional<User> findBySocialId(String socialId);
}
