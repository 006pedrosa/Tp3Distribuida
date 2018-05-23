/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIANDO SERVIDOR");
        Listener novoServidor = new Listener(3535);
    }
    
}
