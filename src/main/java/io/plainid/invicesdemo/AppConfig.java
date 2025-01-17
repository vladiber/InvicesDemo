package io.plainid.invicesdemo;


import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories
        (    basePackages = {"io.plainid.invicesdemo.repository"}
        )
@RequiredArgsConstructor
public class AppConfig {
    private final HibernatePropertyMapper hibernatePropertyMapper;

//    @Autowired
//    private final ConfigUtils configUtils;

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean em
//                = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        em.setPackagesToScan("io.plainid.invicesdemo");
//
//        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//
//        em.setJpaVendorAdapter(vendorAdapter);
//
//        em.setJpaPropertyMap(hibernatePropertyMapper.getHibernateProperties());
//      //  em.setJpaProperties(additionalProperties());
//
//        return em;
//    }
//
//    Properties additionalProperties() {
//        Properties properties = new Properties();
//        BeansConfig bc = new BeansConfig();
//        QueryModificationFlags qmf = bc.queryModificationFlags();
//        RestClient rc = bc.restClient();
//        SQLInterceptor si = bc.sqlInterceptor(rc,qmf);
//        properties.put(AvailableSettings.STATEMENT_INSPECTOR,si );
//        return properties;
//    }
//
//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
//        dataSource.setUsername( "postgres" );
//        dataSource.setPassword( "postgres" );
//        return dataSource;
//    }
//

//    @Bean
//    @Autowired
//    public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory.getObject());
//    }
}