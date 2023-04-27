//package com.car.portfolio.config;
//
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class DataSourceConfig {
//    @Bean
//    public DataSource getDataSource() {
//        return DataSourceBuilder.create()
//          .driverClassName("org.postgresql.Driver")
//          .url("url: jdbc:postgresql://localhost:5432/carapp")
//          .username("postgres")
//          .password("postgres")
//          .build();	
//    }
//}
