package pl.pjatk.rentalservice.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import java.net.ConnectException;

@ControllerAdvice
public class GlobalExeptionsHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<Object> handleHttpClientErrorException(HttpClientErrorException ex) {
        switch (ex.getStatusCode()) {
            case NOT_FOUND:
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            case BAD_REQUEST:
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            default:
                return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<Object> handleHttpServerException(HttpServerErrorException ex) {
        if (ex.getStatusCode().equals(HttpStatus.INTERNAL_SERVER_ERROR)) {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }else return ResponseEntity.status(HttpStatus.OK).build();
    }

    @ExceptionHandler(java.net.ConnectException.class)
    public ResponseEntity<Object> handleConnectException(ConnectException connectException) {
        if (connectException != null) {
            return new ResponseEntity<>(HttpStatus.GATEWAY_TIMEOUT);
        }else return ResponseEntity.status(HttpStatus.OK).build();
    }
}