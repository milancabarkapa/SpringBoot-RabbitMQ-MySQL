package poslovne.aplikacije.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
class ProizvodNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(ProizvodNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String proizvodNotFoundHandler(ProizvodNotFoundException ex) {
    return ex.getMessage();
  }
}

