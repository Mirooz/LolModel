package com.library.lolmodel.repository;

import com.library.lolmodel.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer>{

}