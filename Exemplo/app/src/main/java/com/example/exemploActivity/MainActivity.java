package com.example.exemploActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exemplo.R;

public class MainActivity extends AppCompatActivity {

    private Button btCadastro;
    private Button btListaAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastro = findViewById(R.id.btCadastro);
        btListaAlunos = findViewById(R.id.btListaAlunos);

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastro();
            }
        });

        btListaAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirListaAluno();
            }
        });

    }
    private void abrirCadastro(){
        Intent intent = new Intent(this, CadastroActivity.class);

        startActivity(intent);
    }

    private void abrirListaAluno(){
        Intent intent = new Intent(this, ListaAlunoActivity.class);

        startActivity(intent);
    }

}