package io.plainid.invicesdemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

/**
 * HibernatePropertyMapper. Maps hibernate properties to the ones defined by spring.
 * NOTE: Since we are manually configuring our entity managers, whenever a new hibernate property is set in
 * the configuration files, remember to add that new hibernate property to this class
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class HibernatePropertyMapper {
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "spring.jpa.properties.hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "spring.jpa.show-sql";
    private static final String PROPERTY_NAME_HIBERNATE_GENERATE_STATISTICS =
            "spring.jpa.properties.hibernate.generate_statistics";
    private static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "spring.jpa.properties.hibernate.format_sql";
    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "spring.jpa.hibernate.ddl-auto";
    private static final String PROPERTY_NAME_HIBERNATE_NAMING_PHYSICAL_STRATEGY =
            "spring.jpa.hibernate.naming.physical-strategy";

    private static final String HIBERNATE_SEARCH_DIRECTORY_PROVIDER = "hibernate.search.default.directory_provider";
    private static final String HIBERNATE_SEARCH_INDEX_BASE = "hibernate.search.default.indexBase";
    private static final String HIBERNATE_CONNECTION_HANDLING = "spring.jpa.hibernate.connection_handling_mode";

    private static final String STATEMENT_INSPECTOR = "spring.jpa.properties.hibernate.session_factory.statement_inspector";
    private final Environment env;


    @Value("filesystem")
    private String directoryProvider;

    @Value("/tmp/acuity/search/index")
    private String indexBase;

    public Map<String, Object> getHibernateProperties() {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO));
        properties.put(org.hibernate.cfg.Environment.DIALECT,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_DIALECT));
        properties.put(org.hibernate.cfg.Environment.SHOW_SQL,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_SHOW_SQL));
        properties.put(org.hibernate.cfg.Environment.FORMAT_SQL,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
        properties.put(org.hibernate.cfg.Environment.GENERATE_STATISTICS,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_GENERATE_STATISTICS));
        properties.put(org.hibernate.cfg.Environment.PHYSICAL_NAMING_STRATEGY,
                env.getProperty(HibernatePropertyMapper.PROPERTY_NAME_HIBERNATE_NAMING_PHYSICAL_STRATEGY));
        properties.put(org.hibernate.cfg.Environment.CONNECTION_HANDLING,
                env.getProperty(HibernatePropertyMapper.HIBERNATE_CONNECTION_HANDLING));

        properties.put(org.hibernate.cfg.Environment.STATEMENT_INSPECTOR,
                env.getProperty(HibernatePropertyMapper.STATEMENT_INSPECTOR));
        log.info("Hibernate Search Directory Provider: {}, Index Base: {}", directoryProvider, indexBase);

        properties.put(HIBERNATE_SEARCH_DIRECTORY_PROVIDER, directoryProvider);
        properties.put(HIBERNATE_SEARCH_INDEX_BASE, indexBase);

        return properties;
    }
}