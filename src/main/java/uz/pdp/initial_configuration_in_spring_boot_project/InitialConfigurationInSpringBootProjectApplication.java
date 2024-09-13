package uz.pdp.initial_configuration_in_spring_boot_project;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class InitialConfigurationInSpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitialConfigurationInSpringBootProjectApplication.class, args);
    }

    @Bean
    public AuditorAware<Long> auditorProvider() {
        return new AuditorAware<Long>() {
            @Override
            public Optional<Long> getCurrentAuditor() {
                return Optional.empty();
            }
        };
    }

}
