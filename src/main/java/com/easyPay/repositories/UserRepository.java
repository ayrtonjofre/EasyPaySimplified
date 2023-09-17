package com.easyPay.repositories;

import com.easyPay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //Optional es el retorno de lo que devuelve el metodo de busqueda
    Optional<User> findUserByDocument(String document);

    Optional<User> findUserById(Long id);
}
