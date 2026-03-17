package br.com.alr.api.sbtestapi.product.infrastructure.out.persist;

import br.com.alr.api.sbtestapi.produtGroup.infrastructure.out.persist.ProductGroupEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(
    name = "products",
    uniqueConstraints = {
        @UniqueConstraint(name = "products_group_id_name_idx", columnNames = {"product_group_id", "name"})
    }
)
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 150, nullable = false)
  private String name;

  @Column(columnDefinition = "TEXT")
  private String description;

  @Column(nullable = false)
  private BigDecimal price;

  @Column
  private Boolean enabled;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_group_id")
  private ProductGroupEntity productGroup;

  @PrePersist
  private void prePersist() {
    enabled = true;
  }
}
