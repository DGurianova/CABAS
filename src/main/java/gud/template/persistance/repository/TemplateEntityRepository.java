package gud.template.persistance.repository;

import gud.template.persistance.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateEntityRepository extends JpaRepository<TemplateEntity, String> {
}
