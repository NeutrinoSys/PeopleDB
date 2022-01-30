package com.neutrinosys.peopledb.exception;

import java.sql.SQLException;

public class DataException extends RuntimeException {
    public DataException(String msg) {
        super(msg);
    }

    public DataException(String msg, Throwable e) {
        super(msg, e);
    }
}
