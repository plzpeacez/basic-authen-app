package com.homse.hombackend.infrastructure.message.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter @Setter
@ApiModel(description = "Registration form")
public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    @ApiModelProperty(notes = "this is the name of user to register")
    private String name;

    @NotBlank
    @Size(min = 3, max = 50)
    @ApiModelProperty(notes = "this is the username to login")
    private String username;

    @NotBlank
    @Size(max = 60)
    @Email
    @ApiModelProperty(notes = "this is the email of user to register")
    private String email;

    @ApiModelProperty(notes = "** Role of this user for access system")
    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 40)
    @ApiModelProperty(notes = "this is the password to login")
    private String password;
}
