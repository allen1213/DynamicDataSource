package com.example.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author allen
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSource();
    }
}
