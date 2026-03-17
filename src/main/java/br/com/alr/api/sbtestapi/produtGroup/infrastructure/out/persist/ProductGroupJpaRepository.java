package br.com.alr.api.sbtestapi.produtGroup.infrastructure.out.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductGroupJpaRepository extends JpaRepository<ProductGroupEntity, Long> {
}
