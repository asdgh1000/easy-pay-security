package com.mycompany.myapp.web.rest.userMessage;

import com.codahale.metrics.annotation.Timed;
import com.mycompany.myapp.config.Constants;
import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.domain.UserMessage;
import com.mycompany.myapp.security.AuthoritiesConstants;
import com.mycompany.myapp.service.MailService;
import com.mycompany.myapp.service.UserMessageService;
import com.mycompany.myapp.service.UserService;
import com.mycompany.myapp.service.dto.UserDTO;
import com.mycompany.myapp.service.dto.UserMessageDTO;
import com.mycompany.myapp.web.rest.util.HeaderUtil;
import com.mycompany.myapp.web.rest.util.PaginationUtil;
import com.mycompany.myapp.web.rest.vm.ManagedUserVM;
import io.github.jhipster.web.util.ResponseUtil;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * 用户信息接口
 */
@RestController
@RequestMapping("/easy-pay")
public class UserMessageResource {

    private final Logger log = LoggerFactory.getLogger(UserMessageResource.class);

    private static final String ENTITY_NAME = "userManagement";

    private final UserMessageService userMessageService;

    private final MailService mailService;

    private final UserService userService;

    public UserMessageResource(UserMessageService userMessageService, MailService mailService,
                               UserService userService) {

        this.userMessageService = userMessageService;
        this.mailService = mailService;
        this.userService = userService;
    }

    @PostMapping("/user-message")
    @Timed
    public ResponseEntity createUserMessage(@Valid @RequestBody UserMessageDTO userMessageDTO) {
        log.debug("REST request to save user message : {}", userMessageDTO);
        UserMessage result = userMessageService.createUserMessage(userMessageDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
