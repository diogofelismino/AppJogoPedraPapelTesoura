package app.br.com.appjogoperdrapapeltesoura.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import app.br.com.appjogoperdrapapeltesoura.R;
import app.br.com.appjogoperdrapapeltesoura.controller.PartidaController;
import app.br.com.appjogoperdrapapeltesoura.model.Partida;

public class MainActivity extends AppCompatActivity {

    PartidaController partidaController;
    Partida jogador, computador;

    Button btnPedra, btnPapel, btnTesoura;

    ImageView imgMinhaJogada, imgJogadaAdversaria;

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initComponentes();
        actionButton();


    }

    private void initComponentes() {

        btnPapel = findViewById(R.id.btnPapel);
        btnPedra = findViewById(R.id.btnPedra);
        btnTesoura = findViewById(R.id.btnTesoura);

        imgMinhaJogada = findViewById(R.id.imgJogadaJogador);
        imgJogadaAdversaria = findViewById(R.id.imgJogadaPC);

        resultado = findViewById(R.id.txtResultado);
        resultado.setVisibility(View.INVISIBLE);

        jogador = new Partida();
        computador = new Partida();
        partidaController = new PartidaController();

    }

    private void actionButton() {

        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jogador.setPedra(false);
                jogador.setTesoura(false);
                jogador.setPapel(true);

                Log.i("teste", "onClick: Eu joguei Papel");

                if(partidaController.resultPartida(jogador,computador) == 1){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_launcher);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_pedra);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Vitoria");

                    Log.e("teste", "onClick: Vitoria" );
                }else if(partidaController.resultPartida(jogador,computador) == 2){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_launcher);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_launcher);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Empate");
                    Log.e("teste", "onClick: Empate" );

                }
                else{

                    imgMinhaJogada.setImageResource(R.mipmap.ic_launcher);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_tesoura);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Derrota");
                    Log.e("teste", "onClick: Derrota" );
                }

            }
        });

       btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jogador.setPedra(true);
                jogador.setTesoura(false);
                jogador.setPapel(false);

                Log.i("teste", "onClick: Eu joguei Perda");


                if(partidaController.resultPartida(jogador,computador) == 1){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_pedra);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_tesoura);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Vitoria");
                    Log.e("teste", "onClick: Vitoria" );
                }else if(partidaController.resultPartida(jogador,computador) == 2){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_pedra);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_pedra);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Empate");
                    Log.e("teste", "onClick: Empate" );

                }
                else{

                    imgMinhaJogada.setImageResource(R.mipmap.ic_pedra);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_launcher);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Derrota");
                    Log.e("teste", "onClick: Derrota" );}

            }
        });

        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jogador.setPedra(false);
                jogador.setTesoura(true);
                jogador.setPapel(false);


                Log.i("teste", "onClick: Eu joguei Tesoura");


                if(partidaController.resultPartida(jogador,computador) == 1){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_tesoura);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_launcher);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Vitoria");
                    Log.e("teste", "onClick: Vitoria" );
                }else if(partidaController.resultPartida(jogador,computador) == 2){

                    imgMinhaJogada.setImageResource(R.mipmap.ic_tesoura);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_tesoura);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Empate");
                    Log.e("teste", "onClick: Empate" );

                }
                else{

                    imgMinhaJogada.setImageResource(R.mipmap.ic_tesoura);
                    imgJogadaAdversaria.setImageResource(R.mipmap.ic_pedra);

                    resultado.setVisibility(View.VISIBLE);
                    resultado.setText("Derrota");
                    Log.e("teste", "onClick: Derrota" );}

            }
        });


    }
}