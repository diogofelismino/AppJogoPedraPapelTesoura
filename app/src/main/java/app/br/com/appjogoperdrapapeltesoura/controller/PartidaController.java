package app.br.com.appjogoperdrapapeltesoura.controller;

import android.util.Log;

import app.br.com.appjogoperdrapapeltesoura.model.Partida;

public class PartidaController {



    public int resultPartida(Partida jogador, Partida adversario){

        Partida esc = jogaAdversaria(adversario);

        if (jogador.isPapel() && esc.isPedra()){
            return 1;
        }else if (jogador.isPedra() && esc.isTesoura()){
            return 1;
        } else if (jogador.isTesoura() && esc.isPapel()){
            return 1;
        } else if(jogador.isPapel() && esc.isPapel()){
            return 2;
        } else if(jogador.isTesoura() && esc.isTesoura()){
            return 2;
        } else if(jogador.isPedra() && esc.isPedra()){
            return 2;
        }
        else{
            return 0;
        }

    }

    private Partida jogaAdversaria(Partida adversario){

        String[] escolha = {"Pedra", "Papel", "Tesoura"};
        String partida = null;


        for(int i=0; i < 1;i++){
            int pos = (int) (Math.random() * escolha.length);
            partida = escolha[pos];
        }
        if(partida.equals("Pedra")) {
            adversario.setPedra(true);
            adversario.setTesoura(false);
            adversario.setPapel(false);
            Log.i("teste", "Adverasrio: Eu joguei Pedra");

        }

        if(partida.equals("Papel")) {
            adversario.setPedra(false);
            adversario.setTesoura(false);
            adversario.setPapel(true);

            Log.i("teste", "Adverasrio: Eu joguei Papel");}

        if(partida.equals("Tesoura")) {
            adversario.setPedra(false);
            adversario.setTesoura(true);
            adversario.setPapel(false);
            Log.i("teste", "Adverasrio: Eu joguei tesoura");}

        return adversario;

    }

}
