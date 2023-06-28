package com.ecodewithtrey.fullstackbackend.repository;

import com.ecodewithtrey.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
