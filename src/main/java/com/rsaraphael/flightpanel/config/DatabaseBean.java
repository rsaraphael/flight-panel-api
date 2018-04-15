package com.rsaraphael.flightpanel.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Class responsible to handle database configurations like repositories and models.
 *
 * @author Raphael Alves
 */
@Configuration
@EntityScan(basePackages= {"com.rsaraphael.*"})
@EnableJpaRepositories(basePackages = { "com.rsaraphael.*" })
public class DatabaseBean  {

}
