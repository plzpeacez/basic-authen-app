package com.homse.hombackend.message.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @Setter
@ApiModel(description = "The login form model")
public class LoginForm {
    @NotBlank
    @Size(min=3, max = 60)
    @ApiModelProperty(notes = "username to login")
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    @ApiModelProperty(notes = "password to login")
    private String password;
}
