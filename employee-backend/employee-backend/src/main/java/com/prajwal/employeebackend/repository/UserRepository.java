package com.prajwal.employeebackend.repository;

import com.prajwal.employeebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
