package com.selimhocaoglu.culinaryguide.repository;

import com.selimhocaoglu.culinaryguide.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
