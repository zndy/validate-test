package org.johnny.test.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyException extends Exception{
    private static final Logger log = LoggerFactory.getLogger(MyException.class);

    public MyException() {
        log.error("Wanted to remove more items than there were in shelf");
    }

    public MyException(String message){
        super(message);
        log.error("Wanted to remove more items than there were in shelf");
        log.error("Error Message: " + message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
        log.error("Wanted to remove more items than there were in shelf");
        log.error("Error Message: " + message + "With Cause: " + cause);
    }

    public MyException(Throwable cause) {
        super(cause);
        log.error("Wanted to remove more items than there were in shelf");
        log.error("Error Cause: " + cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        log.error("Wanted to remove more items than there were in shelf");
        log.error("Error Message: " + message + "With Cause: " + cause);
    }

}
