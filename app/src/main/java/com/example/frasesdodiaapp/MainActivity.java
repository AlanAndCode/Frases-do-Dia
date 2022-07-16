package com.example.frasesdodiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.SequenceInputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
     String[] Frases = {
             "A persistência é o caminho do êxito.",
             "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
             "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
             "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
             "No meio da dificuldade encontra-se a oportunidade.",
             "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
             "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
             "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo."
     };
        int Pega = new Random().nextInt(8);//0,1,2,3,4,5,6,7
        TextView texto = findViewById(R.id.GeraP);
        texto.setText( Frases[Pega] );

    }

}