package com.cabas.persistance.repository;

import com.cabas.persistance.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateEntityRepository extends JpaRepository<TemplateEntity, String> {
}
