package uz.pdp.initial_configuration_in_spring_boot_project.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageableResponse {
    private Long total;
    private Integer current;
    private Integer totalPages;
    private Integer perPages;
}

