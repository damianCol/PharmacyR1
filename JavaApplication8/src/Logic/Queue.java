package Logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.Vector;

/**
 *
 * @author Daniel Higuera
 */
public class Queue {
    private int cabeza;
    private Vector elementos;
    
    public Queue(){
        elementos= new Vector();
    }
    
    public void encolar(Object elemento){
        elementos.add(elemento);
        
    }
    
    public Object desencolar() throws Exception{
        if (listaVacia())
            throw new Exception("la cola esta vacia");
        Object aux=elementos.get(0);
        elementos.remove(0);
        return aux;
    }

    private boolean listaVacia() {
        return elementos.size()==0;
        }
    
    public int getTamanio(){
        return  elementos.size();
    }
    
    public Object getElement(int index){
         return elementos.get(index);
     }
}
