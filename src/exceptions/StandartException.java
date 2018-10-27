/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Nathan
 */
public class StandartException extends Exception{

    public StandartException() {
    }

    public StandartException(String message) {
        super(message);
    }

    public StandartException(String message, Throwable cause) {
        super(message, cause);
    }

    public StandartException(Throwable cause) {
        super(cause);
    }
    
}
