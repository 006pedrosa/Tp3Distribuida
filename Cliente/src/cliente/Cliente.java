/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Cliente {

    public static String ip;
    public static int PORTA = 3535;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("INSIRA O IP DO SERVIDOR PARA CONEXAO - PARA CONEXAO LOCAL DIGITE localhost ou 127.0.0.1");
        Scanner in = new Scanner(System.in);
        ip = in.nextLine();
    }
    
}
