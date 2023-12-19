package com.xin.daily;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zengxin
 */
public class ClientDataSourceRouter
  extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ClientDatabaseContextHolder.getClientDatabase();
    }
}