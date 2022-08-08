package com.example.checkboxesandetc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mMessage;
    private CheckBox checkboxChocolateSyrup;
    private CheckBox checkboxSprinkles;
    private CheckBox checkboxCrushedNuts;
    private CheckBox checkboxCherries;
    private CheckBox checkboxOrio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessage = "";
        checkboxChocolateSyrup = findViewById(R.id.chocolate_syrup);
        checkboxSprinkles = findViewById(R.id.sprinkles);
        checkboxCrushedNuts = findViewById(R.id.crushed_nuts);
        checkboxCherries = findViewById(R.id.cherries);
        checkboxOrio = findViewById(R.id.orio_cookie_crumbles);
    }

    public void onSubmit() {
        mMessage = "";
        if (checkboxChocolateSyrup.isChecked())
            mMessage = mMessage + getString(R.string.chocolate_syrup) + " ";
        if (checkboxSprinkles.isChecked())
            mMessage = mMessage + getString(R.string.sprinkles) + " ";
        if (checkboxCrushedNuts.isChecked())
            mMessage = mMessage + getString(R.string.crushed_nuts) + " ";
        if (checkboxCherries.isChecked())
            mMessage = mMessage + getString(R.string.cherries) + " ";
        if (checkboxOrio.isChecked())
            mMessage = mMessage + getString(R.string.orio_cookie_crumbles) ;
    }

    public void showToast(View view) {
        onSubmit();
        Toast.makeText(getApplicationContext(), getString(R.string.toppings) + mMessage,
                Toast.LENGTH_SHORT).show();
    }
}