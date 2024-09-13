package uz.pdp.initial_configuration_in_spring_boot_project.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private String phoneNumber;
    private String password;
}