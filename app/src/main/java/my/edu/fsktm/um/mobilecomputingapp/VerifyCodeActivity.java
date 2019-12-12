package my.edu.fsktm.um.mobilecomputingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VerifyCodeActivity extends AppCompatActivity {

    Button placeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        placeOrder = (Button) findViewById(R.id.BTNPlaceOrder);

        placeOrder.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        Toast.makeText(this, "Please wait for your order...", Toast.LENGTH_SHORT).show();
    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
