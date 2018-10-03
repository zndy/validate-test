package org.johnny.test.service.aop;

import lombok.extern.slf4j.Slf4j;
import org.johnny.test.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Message processValidationException(MyException ex) {
        log.info(ex.toString());
        Message message = new Message();
        message.setMessage(ex.toString());
        return message;
    }
}
