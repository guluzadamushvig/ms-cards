package az.ingress.mscards.dao.repository;

import az.ingress.mscards.dao.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
