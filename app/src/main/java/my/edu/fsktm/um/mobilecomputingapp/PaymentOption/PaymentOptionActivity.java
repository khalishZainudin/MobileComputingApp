package my.edu.fsktm.um.mobilecomputingapp.PaymentOption;

import androidx.appcompat.app.AppCompatActivity;
import my.edu.fsktm.um.mobilecomputingapp.MainMenu;
import my.edu.fsktm.um.mobilecomputingapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaymentOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_option);
    }

    public void goToPaymentPopUp (View view) {
        Intent intent = new Intent(this, PaymentPopUP.class);
        startActivity(intent);
    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
