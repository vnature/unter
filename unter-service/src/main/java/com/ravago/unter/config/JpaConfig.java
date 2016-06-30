package com.ravago.unter.config;

import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.ravago.unter.repository.api")
@EnableTransactionManagement
public class JpaConfig {

	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean f = new LocalContainerEntityManagerFactoryBean();
        f.setDataSource(dataSource());
        f.setJpaVendorAdapter(jpaVendorAdapter());
        f.setPackagesToScan("com.ravago.unter.domain");
        return f;
    }
	
	private JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter a = new HibernateJpaVendorAdapter();
		a.setShowSql(true);
		a.setDatabase(Database.HSQL);
		a.setGenerateDdl(true);
		return a;
	} 

    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }

    @Bean
    public DataSource dataSource() {
    	//jdbc:hsqldb:mem:testdb		
    	EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    			EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
    				.build();
    			return db;
    }

}
