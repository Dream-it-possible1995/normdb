package com.glodon.normdb.entity;

public class NormDB {
    private Integer id;
    private String normdb_id;
    private String normdb_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNormdb_id() {
        return normdb_id;
    }

    public void setNormdb_id(String normdb_id) {
        this.normdb_id = normdb_id;
    }

    public String getNormdb_name() {
        return normdb_name;
    }

    public void setNormdb_name(String normdb_name) {
        this.normdb_name = normdb_name;
    }
}
