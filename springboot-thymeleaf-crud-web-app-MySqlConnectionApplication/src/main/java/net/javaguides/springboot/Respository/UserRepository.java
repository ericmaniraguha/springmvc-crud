package net.javaguides.springboot.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
