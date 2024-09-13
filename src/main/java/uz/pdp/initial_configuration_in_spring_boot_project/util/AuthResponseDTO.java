package uz.pdp.initial_configuration_in_spring_boot_project.util;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthResponseDTO {
    private String accessToken;
    private String refreshToken;
}
