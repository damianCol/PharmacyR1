/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Logic.DatesCustomer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class CustomerD {
    public static void main(String[] args){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = "01/01/2013";
        String dateBirth = "17/04/1997";
        Date dateBirthVar = null;
        try {
            dateBirthVar = dateFormat.parse(dateBirth);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerD.class.getName()).log(Level.SEVERE, null, ex);
        }
        DatesCustomer dct = new DatesCustomer();
        dct.setDateBirth(dateBirthVar);
    }
}
