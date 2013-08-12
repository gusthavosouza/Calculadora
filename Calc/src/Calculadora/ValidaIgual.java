/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import static Calculadora.Calculadora.validaLong;
import javax.swing.JTextArea;

/**
 *
 * @author Gustavo
 */
public class ValidaIgual {
    
    public String valida(String texto){
     JTextArea texo = new JTextArea();
        String text = String.valueOf(texto.length());
       String linhas [] = texto.split(" ");
       String num1 = linhas[0];
       String num2 = linhas[2];
       
        
       
       for(int i =0 ; i < linhas.length;i++){
         if(linhas[i].equals("+")){
              long a = validaLong(num1);
               long b = validaLong(num2);
  
               
          long result =a +b;
           String res = String.valueOf(result);
          texo.setText(res);
       }
         
       if(linhas[i].equals("*")){
                    long a = validaLong(num1);
               long b = validaLong(num2);
                   long result = a * b;
           String res = String.valueOf(result);
         texo.setText(res);
               }
       if(linhas[i].equals("-")){
            long a = validaLong(num1);
               long b = validaLong(num2);
               long result = a - b;
           String res = String.valueOf(result);
           texo.setText(res);
       }
       if(linhas[i].equals("/")){
           
           String num = String.valueOf(num1);
           String nume = String.valueOf(num2);
           double a = Double.parseDouble(num);
           double b = Double.parseDouble(nume);
          
          double result = a / b;
   
           String res = String.valueOf(result);
        texo.setText(res);
       }
       }
    return texto;
    }
    
    
    
}
