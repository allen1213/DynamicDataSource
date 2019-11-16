package com.example.utils;

/**
 * @author allen
 */
public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> HOLDER = new ThreadLocal();

    public static void setDataSource(String dataSource) {
        HOLDER.set(dataSource);
    }

    public static String getDataSource() {
        return HOLDER.get();
    }

    public static void clearDataSource() {
        HOLDER.remove();
    }

}
