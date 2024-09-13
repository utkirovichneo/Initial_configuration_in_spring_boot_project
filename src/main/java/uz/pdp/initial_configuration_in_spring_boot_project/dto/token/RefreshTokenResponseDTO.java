package uz.pdp.initial_configuration_in_spring_boot_project.dto.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshTokenResponseDTO {
    private String accessToken;
}