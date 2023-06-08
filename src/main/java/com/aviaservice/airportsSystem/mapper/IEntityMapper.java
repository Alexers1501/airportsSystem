package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.IdentifiableEntityDto;
import com.aviaservice.airportsSystem.entity.IdentifiableEntity;

public interface IEntityMapper<E extends IdentifiableEntity, D extends IdentifiableEntityDto> {

    E mapToEntity(D dto);

    D mapToDto(E entity);
}
