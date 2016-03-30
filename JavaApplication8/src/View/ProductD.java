/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Logic.Product;
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
public class ProductD {
    public static void main(String[] args){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha= "01/01/2013";
        String fechaNacimiento="17/04/1997";
        Date fechaIngreso=null;
        Date fechaNaci=null;
        try {
            fechaIngreso = formatoFecha.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ProductD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fechaNaci = formatoFecha.parse(fechaNacimiento);
        } catch (ParseException ex) {
            Logger.getLogger(ProductD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Product e = new Product();
        e.setDate_of_admission(fechaIngreso);
//        e.setFechaNacimiento(fechaNaci);
        e.setPrice(6000000);
        System.out.println("La antiguedad es " + (e.getAntiguedad()/365) + " años");
//        System.out.println("La edad es " + (e.getEdadEmpleado()/365) + " años");
        
        NumberFormat formatodinero = NumberFormat.getCurrencyInstance();
        System.out.println("Las prestaciones son " +formatodinero.format(e.getPrestaciones()));
    }
}
