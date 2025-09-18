package dev.jlucasbs.study.spring_ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jlucasbs.study.spring_ws.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
