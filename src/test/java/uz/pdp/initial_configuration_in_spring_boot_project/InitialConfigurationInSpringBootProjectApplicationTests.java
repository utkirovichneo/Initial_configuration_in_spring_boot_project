package uz.pdp.initial_configuration_in_spring_boot_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.pdp.initial_configuration_in_spring_boot_project.entity.Role;
import uz.pdp.initial_configuration_in_spring_boot_project.entity.User;
import uz.pdp.initial_configuration_in_spring_boot_project.repository.RoleRepository;
import uz.pdp.initial_configuration_in_spring_boot_project.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class InitialConfigurationInSpringBootProjectApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Test
    void contextLoads() {
        userRepository.deleteAll();
    }

}
