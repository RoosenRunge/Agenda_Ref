package com.example.agenda_ref;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    // criando as variáveis de botão da tela inicial
    private Button btnCadastro;
    private Button btnAtualiza;
    private Button btnVisualiza;
    private Button btnApagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

// 2  "linkando" as váriaveis com as Views no XML
        btnCadastro=(Button)findViewById(R.id.cadastrarXML);
        btnAtualiza=(Button)findViewById(R.id.atualizarXML);
        btnVisualiza=(Button)findViewById(R.id.visualizarXML);
        btnApagar=(Button)findViewById(R.id.apagarXML);

// 3.1 criando um listener para disparar a tela de cadastro
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(it);
            }
        });
// 3.2 criando um listener para disparar a tela de visualização dos contatos
        btnVisualiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ExibeContatos.class);
                startActivity(it);
            }
        });
// 3.3 criando um listener para disparar a tela de apagar cadastro
        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Apagar.class);
                startActivity(it);
            }
        });
// 3.4 criando um listener para disparar a tela de atualização de cadastro
        btnAtualiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Atualizar.class);
                startActivity(it);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}