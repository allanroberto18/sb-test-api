package br.com.alr.api.sbtestapi.produtGroup.infrastructure.out.persist;

import jakarta.persistence.*;
import lombok.*;

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
  private Long id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column
  private Boolean enabled;

  @PrePersist
  public void prePersist() {
    enabled = true;
  }
}
