package com.aviaservice.airportsSystem.dto;

import java.util.Objects;

public abstract class IdentifiableEntity {
    /*
    Уникальный индентификатор для всех сущностей (entity)
     */

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentifiableEntity that = (IdentifiableEntity) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
