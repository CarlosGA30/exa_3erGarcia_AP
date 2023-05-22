package com.example.exa_3er_garcia_ap;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class AudioVideoActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btnReproducirCG,btnDetenerCG;
    public MediaPlayer reproductorCG;

    public VideoView videoPruebaCG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_video);
        btnReproducirCG=findViewById(R.id.btnReproducirCG);
        btnDetenerCG=findViewById(R.id.btnDetenerCG);
        videoPruebaCG= (VideoView) findViewById(R.id.videoPruebaCG);
        btnReproducirCG.setOnClickListener(this);
        btnDetenerCG.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReproducirCG){
            play_mp1();
        }

        if(view.getId()==R.id.btnDetenerCG){
            stop();
        }

    }

    private void play_mp1(){//inicia metodo
        reproductorCG=MediaPlayer.create(this, R.raw.sonido);
        reproductorCG.start();
        //para reproducir video
        Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);//recursos externos
        MediaController mc = new MediaController(this);//instancia para controles de video y reproduccion
        videoPruebaCG.setMediaController(mc);//Coloca los botones de reprocur, pausa y detener
        videoPruebaCG.setVideoURI(path);//llamado del URI es para identificar el cursos video a reproducir
        videoPruebaCG.setMediaController(new MediaController(this));//Integra los controles y el recurso URI
        videoPruebaCG.start();//ejecucio
    }//termina metodo

    private void stop(){//inicia metodo
        reproductorCG.stop();
    }
}