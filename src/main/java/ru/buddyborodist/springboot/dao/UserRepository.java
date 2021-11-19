package ru.buddyborodist.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.buddyborodist.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    User getUserById(long id);
}