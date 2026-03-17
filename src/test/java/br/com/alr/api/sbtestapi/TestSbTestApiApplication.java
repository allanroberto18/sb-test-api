package br.com.alr.api.sbtestapi;

import org.springframework.boot.SpringApplication;

public class TestSbTestApiApplication {

  public static void main(String[] args) {
    SpringApplication.from(SbTestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
