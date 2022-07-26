package com.as.tic_tok_toe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GameTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_type);

        final AppCompatButton singlePlayerBtn = (AppCompatButton) findViewById(R.id.singlePlayerBtn);
        final AppCompatButton multiplayerBtn = (AppCompatButton) findViewById(R.id.multiPlayerBtn);
        final AppCompatButton localModeBtn = (AppCompatButton) findViewById(R.id.localModeBtn);

        singlePlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameTypeActivity.this, com.as.tic_tok_toe.SingleMode.class));
            }
        });

        multiplayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameTypeActivity.this, Multiplayer.class));
            }
        });

        localModeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameTypeActivity.this, com.as.tic_tok_toe.LocalMode.class));
            }
        });
    }
}