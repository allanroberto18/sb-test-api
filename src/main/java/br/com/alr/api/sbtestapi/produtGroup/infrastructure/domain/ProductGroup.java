package br.com.alr.api.sbtestapi.produtGroup.infrastructure.domain;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductGroup {

  private Integer id;
  private String name;
  private Boolean enabled;

  public static ProductGroup createInstance(final String name) {
    return ProductGroup.builder()
        .name(name)
        .enabled(true)
        .build();
  }

  public static ProductGroup createInstance(final Integer id, final String name, final Boolean enabled) {
    return ProductGroup.builder()
        .id(id)
        .name(name)
        .enabled(enabled)
        .build();
  }
}
