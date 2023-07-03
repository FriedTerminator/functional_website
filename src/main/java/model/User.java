package model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public record User(
        @Id
        Integer id,
        @NotBlank
        String firstName,
        @NotBlank
        String lastName,
        Status status,
        String username,
        @NotNull
        String password,
        @Valid
        String email
) {
}
