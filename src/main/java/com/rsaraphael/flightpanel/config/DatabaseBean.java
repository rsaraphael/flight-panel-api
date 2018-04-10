package com.rsaraphael.flightpanel.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages= {"com.rsaraphael.*"})
@EnableJpaRepositories(basePackages = { "com.rsaraphael.*" })
public class DatabaseBean  {

//	protected DatabaseBean(DataSource dataSource, JpaProperties properties,
//			ObjectProvider<JtaTransactionManager> jtaTransactionManager,
//			ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
//		super(dataSource, properties, jtaTransactionManager, transactionManagerCustomizers);
//	}
//
//	@Override
//	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
//		return new HibernateJpaVendorAdapter();
//	}
//
//	@Override
//	protected Map<String, Object> getVendorProperties() {
//		return null;
//	}

}
