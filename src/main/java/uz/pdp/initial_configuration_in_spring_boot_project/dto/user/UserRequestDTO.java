package uz.pdp.initial_configuration_in_spring_boot_project.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {
    private String phoneNumber;
    private String password;
}