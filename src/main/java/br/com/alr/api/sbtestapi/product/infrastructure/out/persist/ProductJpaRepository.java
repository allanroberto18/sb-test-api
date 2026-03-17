package br.com.alr.api.sbtestapi.product.infrastructure.out.persist;

import br.com.alr.api.sbtestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Integer> {
}
