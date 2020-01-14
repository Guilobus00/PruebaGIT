/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Guille López
 */
public class PruebaGit {

     public boolean palindromo (String cadena){
        //suponemos que el String que nos pasan no tiene tildes.
        cadena = cadena.toUpperCase();
        int izq = 0;
        int der = cadena.length() -1;
        cadena = quita (cadena);
        while ((izq <= der) && (cadena.charAt(izq) == cadena.charAt(der))){
            izq++;
            der--;
        }
        if (izq > der){
            return true;
        }
        return false;
  }
    
    private String quita (String cadena){
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i)!=' ') {
            auxiliar = auxiliar + cadena.charAt(i);
        }
        }
        return auxiliar;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://github.com/Guilobus00/PruebaGIT.git
        //he añadido un método que quita espacios
    }
    
}
