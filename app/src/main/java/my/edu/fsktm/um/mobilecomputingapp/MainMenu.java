package my.edu.fsktm.um.mobilecomputingapp;

import androidx.appcompat.app.AppCompatActivity;
import my.edu.fsktm.um.mobilecomputingapp.ChatBot.ChatBot;
import my.edu.fsktm.um.mobilecomputingapp.PaymentOption.PaymentOptionActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void goToMainVerify(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public  void goToChatBot(View view) {
        Intent intent = new Intent(this, ChatBot.class);
        startActivity(intent);
    }

    public  void goToCOD(View view) {
        Intent intent = new Intent(this, PaymentOptionActivity.class);
        startActivity(intent);
    }
}
