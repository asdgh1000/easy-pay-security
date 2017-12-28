package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface UserMessageRepository extends JpaRepository<UserMessage, Long> {

    UserMessage saveAndFlush(UserMessage userMessage);
}
