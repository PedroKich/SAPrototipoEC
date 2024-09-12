package com.DenunciaDeCrimeAmbiental.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DenunciaDeCrimeAmbiental.projeto.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
    
