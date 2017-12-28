package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.UserMessage;
import com.mycompany.myapp.repository.UserMessageRepository;
import com.mycompany.myapp.service.dto.UserMessageDTO;
import com.mycompany.myapp.utils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class UserMessageService {

    private final Logger log = LoggerFactory.getLogger(UserMessageService.class);

    private final UserMessageRepository userMessageRepository;


    public UserMessageService(UserMessageRepository userMessageRepository) {
        this.userMessageRepository = userMessageRepository;
    }

    public UserMessage createUserMessage(UserMessageDTO userMessageDTO) {
        UserMessage userMessage = BeanUtils.mapObjects(userMessageDTO, UserMessage.class);
        return userMessageRepository.save(userMessage);
    }
}
