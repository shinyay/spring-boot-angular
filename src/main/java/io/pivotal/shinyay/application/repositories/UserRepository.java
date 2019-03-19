package io.pivotal.shinyay.application.repositories;

import io.pivotal.shinyay.application.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
