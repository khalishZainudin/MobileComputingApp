package my.edu.fsktm.um.mobilecomputingapp.ChatBot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import my.edu.fsktm.um.mobilecomputingapp.MainMenu;
import my.edu.fsktm.um.mobilecomputingapp.R;

public class ChatBot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);
    }


    public void goToText(View view){
        Intent intent = new Intent(this, MainActivityChat.class);
        startActivity(intent);
    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
