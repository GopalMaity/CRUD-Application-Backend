package com.gopalmaity.CRUDApplication.repository;

import com.gopalmaity.CRUDApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
