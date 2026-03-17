package br.com.alr.api.sbtestapi.product.domain;

import br.com.alr.api.sbtestapi.produtGroup.infrastructure.domain.ProductGroup;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
  private Integer id;
  private String name;
  private String description;
  private BigDecimal price;
  private Boolean enabled;
  private ProductGroup productGroup;

  public static Product createInstance(String name, String description, BigDecimal price, ProductGroup productGroup) {
    return Product.builder()
        .name(name)
        .description(description)
        .price(price)
        .enabled(true)
        .productGroup(productGroup)
        .build();
  }

  public static Product createInstance(Integer id, String name, String description, BigDecimal price, Boolean enabled, ProductGroup productGroup) {
    return Product.builder()
        .id(id)
        .name(name)
        .description(description)
        .price(price)
        .enabled(enabled)
        .productGroup(productGroup)
        .build();
  }
}
