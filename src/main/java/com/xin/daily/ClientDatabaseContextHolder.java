package com.xin.daily;

import org.springframework.util.Assert;

/**
 * @author zengxin
 */
public class ClientDatabaseContextHolder {

    private static ThreadLocal<ClientDatabase> CONTEXT
      = new ThreadLocal<>();

    public static void set(ClientDatabase clientDatabase) {
        Assert.notNull(clientDatabase, "clientDatabase cannot be null");
        CONTEXT.set(clientDatabase);
    }

    public static ClientDatabase getClientDatabase() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
}