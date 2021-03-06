package com.example.blog.repository.user;

import com.example.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>,UserRepositoryCustom {

}
