/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.Socket;

/**
 *
 * @author 907291
 */
public class GerenciadorDeConexao implements Runnable{

    Socket conexao;

    GerenciadorDeConexao(Socket conexao) {
        this.conexao = conexao;
    }

    @Override
    public void run() {
        
    }
    
    
}
