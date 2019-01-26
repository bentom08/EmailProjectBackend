package com.infosys.emailProject.persistence.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.emailProject.persistence.domain.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, String> {

}
