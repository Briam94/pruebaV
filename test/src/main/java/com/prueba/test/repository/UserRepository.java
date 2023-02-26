package com.prueba.test.repository;

import com.prueba.test.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.usuario = ?1 AND u.pass = ?2")
    UserEntity findByUserPass(String usuario, String pass);
}
