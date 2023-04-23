package com.toyshop.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

//     @Autowired
//     private UserDetailsService userDetailsService;
  
//     @Bean
//     public PasswordEncoder passwordEncoder() {
//       return new BCryptPasswordEncoder();
//     }
  
//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//     }
  
//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//       http.authorizeRequests()
//         .antMatchers("/login", "/register").permitAll()
//         .anyRequest().authenticated()
//         .and()
//         .formLogin()
//         .loginPage("/login")
//         .defaultSuccessUrl("/")
//         .and()
//         .logout()
//         .logoutSuccessUrl("/login")
//         .invalidateHttpSession(true)
//         .deleteCookies("JSESSIONID");
//     }
//   }
    
// }
}