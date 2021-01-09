
package Aula1;

import javax.swing.JOptionPane;


public class Exercicio1 {
    
public static void main (String [] args) {
        
int N1, N2;

   N1 = Integer.parseInt (JOptionPane.showInputDialog (null, "\n Digite o valor 1:"));
   N2 = Integer.parseInt (JOptionPane.showInputDialog (null, "\n Digite o valor 2:"));

   
    if(N1 % 3 == 0) {
        JOptionPane.showMessageDialog(null, "\n " + N1 + " é múltiplo de 3 ");}
        
    else if ( N1 % 2 == 0 ) {
        JOptionPane.showMessageDialog(null, "\n " + N1 + " é múltiplo de 2 ");}
    
    else if ( N2 % 3 == 0 ) {
        JOptionPane.showMessageDialog(null, "\n " + N2 + " é múltiplo de 3 ");}
    
    else if ( N2 % 2 == 0 ) {
        JOptionPane.showMessageDialog(null, "\n " + N2 + " é múltiplo de 2 ");}
     
       
    }
}