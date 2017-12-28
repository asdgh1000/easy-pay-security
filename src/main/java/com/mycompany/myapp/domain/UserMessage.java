package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A user.
 */
@Entity
@Table(name = "easy_pay_user_message")
@Data
public class UserMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 真实姓名
     */
    @NotNull
    @Size(max = 20)
    @Column(name = "real_name", length = 50)
    private String realName;

    /**
     * 身份证号
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "id_number", length = 50)
    private String idNumber;

    /**
     * 首款银行号码
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "receive_bank_number", length = 50)
    private String receiveBankNumber;

    /**
     * 收款银行名称
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "receive_bank_name", length = 50)
    private String receiveBankName;

    /**
     * 收款银行支行名称
     */
    @NotNull
    @Size(max = 100)
    @Column(name = "receive_bank_branch", length = 100)
    private String receiveBankBranch;

    /**
     * 收款银行预留电话
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "receive_bank_phone", length = 50)
    private String receiveBankPhone;

    /**
     * 身份证正面url
     */
    @NotNull
    @Size(max = 255)
    @Column(name = "id_card_front_url", length = 255)
    private String idCardFrontUrl;

    /**
     * 身份证背面url
     */
    @NotNull
    @Size(max = 255)
    @Column(name = "id_card_back_url", length = 255)
    private String idCardBackUrl;

    /**
     * 身份证手持照片url
     */
    @NotNull
    @Size(max = 255)
    @Column(name = "id_card_hand_url", length = 255)
    private String idCardHandUrl;




}
