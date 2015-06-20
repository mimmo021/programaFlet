/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesexception;

/**
 *
 * @author peppe
 */
public class CheckOutException extends Exception{
    public CheckOutException(String message){
        super(message);
    }
}
