package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.IdentifiableDto;
import com.aviaservice.airportsSystem.entity.IdentifiableEntity;

public interface IEntityMapper<E extends IdentifiableEntity, D extends IdentifiableDto> {

    E mapToEntity(D dto);

    D mapToDto(E entity);
}
