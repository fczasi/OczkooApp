package com.fpp.oczkoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button nastepnaKarta, koniecGry;
    private ImageView losowaKarta;
    private TextView dane;
    private int[] cardsId = {
            R.drawable.karowalet,
            R.drawable.kierwalet,
            R.drawable.treflwalet,
            R.drawable.pikwalet,
            R.drawable.karokrolowa,
            R.drawable.kierkrolowa,
            R.drawable.treflkrolowa,
            R.drawable.pikkrolowa,
            R.drawable.karokrol,
            R.drawable.kierkrol,
            R.drawable.treflkrol,
            R.drawable.pikkrol,
            R.drawable.karo2,
            R.drawable.kier2,
            R.drawable.trefl2,
            R.drawable.pik2,
            R.drawable.karo3,
            R.drawable.kier3,
            R.drawable.trefl3,
            R.drawable.pik3,
            R.drawable.karo4,
            R.drawable.kier4,
            R.drawable.trefl4,
            R.drawable.pik4,
            R.drawable.karo5,
            R.drawable.kier5,
            R.drawable.trefl5,
            R.drawable.pik5,
            R.drawable.karo6,
            R.drawable.kier6,
            R.drawable.trefl6,
            R.drawable.pik6,
            R.drawable.karo7,
            R.drawable.kier7,
            R.drawable.trefl7,
            R.drawable.pik7,
            R.drawable.karo8,
            R.drawable.kier8,
            R.drawable.trefl8,
            R.drawable.pik8,
            R.drawable.karo9,
            R.drawable.kier9,
            R.drawable.trefl9,
            R.drawable.pik9,
            R.drawable.karo10,
            R.drawable.kier10,
            R.drawable.trefl10,
            R.drawable.pik10
    };
    private int[][] naRodzaje = {

            {
                R.drawable.karo2,
                    R.drawable.kier2,
                    R.drawable.trefl2,
                    R.drawable.pik2
            },
            {R.drawable.karo3,
                    R.drawable.kier3,
                    R.drawable.trefl3,
                    R.drawable.pik3,
            },
            {R.drawable.karo4,
                    R.drawable.kier4,
                    R.drawable.trefl4,
                    R.drawable.pik4,
            },
            {R.drawable.karo5,
                    R.drawable.kier5,
                    R.drawable.trefl5,
                    R.drawable.pik5,
            },
            {R.drawable.karo6,
                    R.drawable.kier6,
                    R.drawable.trefl6,
                    R.drawable.pik6,
            },
            {R.drawable.karo7,
                    R.drawable.kier7,
                    R.drawable.trefl7,
                    R.drawable.pik7,
            },
            {R.drawable.karo7,
                    R.drawable.kier7,
                    R.drawable.trefl7,
                    R.drawable.pik7,
            },
            {R.drawable.karo8,
                    R.drawable.kier8,
                    R.drawable.trefl8,
                    R.drawable.pik8,
            },
            {R.drawable.karo9,
                    R.drawable.kier9,
                    R.drawable.trefl9,
                    R.drawable.pik9,
            },
            {R.drawable.karowalet,
                    R.drawable.kierwalet,
                    R.drawable.treflwalet,
                    R.drawable.pikwalet
            },
            {R.drawable.karokrolowa,
                    R.drawable.kierkrolowa,
                    R.drawable.treflkrolowa,
                    R.drawable.pikkrolowa,
            },
            {R.drawable.karokrol,
                    R.drawable.kierkrol,
                    R.drawable.treflkrol,
                    R.drawable.pikkrol,
            }

    };

    private int[][] listaKart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaKart = naRodzaje;
        //for(int k = 0; k< cardsId.length-1; k++){
        //    listaKart.add(cardsId[k]);
        //}
        Random random= new Random();

        nastepnaKarta = findViewById(R.id.nastepnaKrata);
        koniecGry = findViewById(R.id.koniecGry);
        losowaKarta = findViewById(R.id.losowaKarta);
        dane = findViewById(R.id.dane);

        nastepnaKarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int losowa = -1;
                int iloscZuzytych = 0;
                do{
                    losowa = random.nextInt(listaKart.length);
                }while(listaKart[losowa] < 0);
                for(int i = 0; i < listaKart.length; i++){
                    if(listaKart[i] < 0){
                        iloscZuzytych++;
                    }
                }
                if(iloscZuzytych >= listaKart.length - 1){
                    losowaKarta.setImageResource(R.drawable.joker1);
                }else{
                    losowaKarta.setImageResource(listaKart[losowa]);
                    listaKart[losowa] = -1;
                }
            }
        });

        koniecGry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int losowa = -1;
                int iloscZuzytych = 0;
                int numer, rodzaj;
                do{
                    numer = random.nextInt(13);
                    rodzaj = random.nextInt(5);
                }while();
            }
        });


    }
}




/*
Karty 2 do 10 mają wartość równą wartości karty
walet – 2 pkt.
dama – 3 pkt.
król – 4 pkt.
As – 11 pkt.
 */