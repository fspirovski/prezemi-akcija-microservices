package mk.ukim.finki.usersservice.model.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class LoginDto {

    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Size(min = 8, max = 16)
    private String password;
}
