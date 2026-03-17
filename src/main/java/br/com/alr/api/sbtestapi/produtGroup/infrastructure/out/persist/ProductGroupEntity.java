package br.com.alr.api.sbtestapi.produtGroup.infrastructure.out.persist;

import br.com.alr.api.sbtestapi.product.infrastructure.out.persist.ProductEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(
    name = "products_groups",
    uniqueConstraints = {
        @UniqueConstraint(name = "products_groups_name_idx", columnNames = "name")
    }
)
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductGroupEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column
  private Boolean enabled;

  @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
  private List<ProductEntity> products;

  @PrePersist
  public void prePersist() {
    enabled = true;
  }
}
