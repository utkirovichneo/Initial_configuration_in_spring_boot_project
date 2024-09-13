package uz.pdp.initial_configuration_in_spring_boot_project.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ErrorDetailDTO{
    private String field;
    private String error;
}
