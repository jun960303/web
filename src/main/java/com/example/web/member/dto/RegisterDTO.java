package com.example.web.member.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RegisterDTO {
    @NotBlank(message = "아이디는 4~8 자리 사이로 작성해야 합니다.")
    private String id;

    @NotEmpty(message = "비밀번호는 4~8자리 사이로 작성해야 합니다.")
    private String password;

    @NotEmpty(message = "이메일 형식에 맞춰 작성해야 합니다.")
    private String email;
}
