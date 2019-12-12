package my.edu.fsktm.um.mobilecomputingapp.PaymentOption;

import androidx.appcompat.app.AppCompatActivity;
import my.edu.fsktm.um.mobilecomputingapp.MainMenu;
import my.edu.fsktm.um.mobilecomputingapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OrderSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);

        Toast.makeText(this, "Payment option has been made.", Toast.LENGTH_SHORT).show();
    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

}
