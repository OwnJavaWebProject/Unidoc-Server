//package com.sixth.unidoc.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    DataSourceConfiguration dataSourceConfiguration;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/", "index.html").permitAll();
//
//        http.formLogin().loginPage("/").and().rememberMe().and().logout().logoutSuccessUrl("/");
//    }
//
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////        super.configure(web);
////        web.ignoring().antMatchers("/css/**","/images/**");
////    }
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSourceConfiguration.MySqlDataSource());
//    }
//}
