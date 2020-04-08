package be.heydari.cac.commons;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * A utility class for easily building RequestEntity instances.
 */
public class ResponseEntities {

    public static ResponseEntity<?> badRequest() {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<?> badRequest(Object body) {
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<?> created() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public static ResponseEntity<?> created(Object body) {
        return new ResponseEntity<>(body, HttpStatus.CREATED);
    }

    public static ResponseEntity<?> iAmATeapot() {
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

    public static ResponseEntity<?> internalServerError(Object body) {
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static ResponseEntity<?> noContent() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public static ResponseEntity<?> ok() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public static ResponseEntity<?> ok(Object body) {
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    public static ResponseEntity<?> notFound() {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<?> forbidden() {
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }


    public static ResponseEntity<?> forbidden(Object body) {
        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }

    public static ResponseEntity<?> accepted(Object body) {
        return new ResponseEntity<>(body, HttpStatus.ACCEPTED);
    }
}