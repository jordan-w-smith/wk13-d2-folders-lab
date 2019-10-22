package com.example.filesAndFoldersService.repositories;

import com.example.filesAndFoldersService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
