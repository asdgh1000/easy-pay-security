package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.config.Constants;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.Set;

/**
 * A DTO representing a user, with his authorities.
 */
@Data
public class UserMessageDTO {


    private Long id;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 首款银行号码
     */
    private String receiveBankNumber;

    /**
     * 收款银行名称
     */
    private String receiveBankName;

    /**
     * 收款银行支行名称
     */
    private String receiveBankBranch;

    /**
     * 收款银行预留电话
     */
    private String receiveBankPhone;

    /**
     * 身份证正面url
     */
    private String idCardFrontUrl;

    /**
     * 身份证背面url
     */
    private String idCardBackUrl;

    /**
     * 身份证手持照片url
     */
    private String idCardHandUrl;
}
