package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInsufficientException extends Exception {

    public BeerStockInsufficientException(long id, int quantityToDecrement) {
        super(String.format("Insufficient Stock for decrement %s from beer with ID: %s", quantityToDecrement, id));
    }

    public BeerStockInsufficientException(long id, int quantityToDecrement, int stock) {
        super(String.format("Insufficient Stock for decrement %s from beer with ID: %s. Current Stock: %s", quantityToDecrement, id, stock));
    }
}
