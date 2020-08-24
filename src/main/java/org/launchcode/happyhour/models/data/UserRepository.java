package org.launchcode.happyhour.models.data;

import org.launchcode.happyhour.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
