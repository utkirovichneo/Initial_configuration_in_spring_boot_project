package uz.pdp.initial_configuration_in_spring_boot_project.mapper;

import java.util.List;
    /**
    * D - DTO
    * E - Entity
    */
public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntity(List<D> list);
    List<D> toDto(List<E> list);
}