package br.com.alr.api.sbtestapi.produtGroup.infrastructure.out.persist;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "products_groups",
    uniqueConstraints = {
        @UniqueConstraint(name = "products_groups_name_idx", columnNames = "name")
    }
)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
