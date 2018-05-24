package com.sixth.unidoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Profile("dev")
@Configuration
public class DataSourceConfiguration {

    @Bean
    public DataSource MySqlDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/unidoc");
        ds.setUsername("temp");
        ds.setPassword("123456");
        return ds;
    }
}
