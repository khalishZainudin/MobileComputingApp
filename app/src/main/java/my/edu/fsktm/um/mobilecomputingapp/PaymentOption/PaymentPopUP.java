package my.edu.fsktm.um.mobilecomputingapp.PaymentOption;

import androidx.appcompat.app.AppCompatActivity;
import my.edu.fsktm.um.mobilecomputingapp.MainMenu;
import my.edu.fsktm.um.mobilecomputingapp.R;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class PaymentPopUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_pop_up);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        layout.setBackground(getDrawable(R.color.colorPrimary));
    }

    public void goToOrderSuccess(View view) {
        Intent intent = new Intent(this, OrderSuccess.class);
        startActivity(intent);
    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
