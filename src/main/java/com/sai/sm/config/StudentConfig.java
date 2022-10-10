package com.sai.sm.config;

import com.mysql.cj.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sai"})
public class StudentConfig {

   @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/view/");
        return viewResolver;
    }

    @Bean
    JdbcTemplate jdbcTemplate(){
       JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
       return jdbcTemplate;
    }

    @Bean
    DriverManagerDataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/rsk?useSSL=false");
       dataSource.setUsername("root");
       dataSource.setPassword("Acadia@123");
       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       return dataSource;
    }


}
