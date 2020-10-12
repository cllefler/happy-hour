package org.launchcode.happyhour.models.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
//    @NotBlank
    @Size(min = 3, message = "Invalid username.  Must be at least 3 characters.")
    private String username;

    @NotNull
//    @NotBlank
    @Size(min = 6, message = "Invalid password.  Must be at least 6 characters.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
