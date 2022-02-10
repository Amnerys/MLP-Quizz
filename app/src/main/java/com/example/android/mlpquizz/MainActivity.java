package com.example.android.mlpquizz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton question3;
    RadioButton question4;

    EditText celestiaEditText;

    CheckBox oneACheckbox;
    CheckBox oneBCheckbox;
    CheckBox oneCCheckbox;
    CheckBox oneDCheckbox;

    CheckBox fiveACheckbox;
    CheckBox fiveBCheckbox;
    CheckBox fiveCCheckbox;
    CheckBox fiveDCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Radio Buttons
        question3 = findViewById(R.id.threeB);
        question4 = findViewById(R.id.fourA);

        //Text Entry
        celestiaEditText = (EditText) findViewById(R.id.textEntry);


        //Checkbox question One
        oneACheckbox = (CheckBox) findViewById(R.id.oneA);
        oneBCheckbox = (CheckBox) findViewById(R.id.oneB);
        oneCCheckbox = (CheckBox) findViewById(R.id.oneC);
        oneDCheckbox = (CheckBox) findViewById(R.id.oneD);

        //Checkbox question Five
        fiveACheckbox = (CheckBox) findViewById(R.id.fiveA);
        fiveBCheckbox = (CheckBox) findViewById(R.id.fiveB);
        fiveCCheckbox = (CheckBox) findViewById(R.id.fiveC);
        fiveDCheckbox = (CheckBox) findViewById(R.id.fiveD);

    }

    public void submit(View view) {

        int score = 0;

        if (question3.isChecked()) {
            score ++;
        }

        if (question4.isChecked()) {
            score ++;
        }
        String celestia = celestiaEditText.getText().toString().trim();
        if (celestia.equalsIgnoreCase(getString(R.string.celestia))){
            score ++;
        }

        if (oneACheckbox.isChecked() && !oneBCheckbox.isChecked() && !oneCCheckbox.isChecked() && oneDCheckbox.isChecked()) {
            score ++;
        }

        if (fiveACheckbox.isChecked() && !fiveBCheckbox.isChecked() && fiveCCheckbox.isChecked() && !fiveDCheckbox.isChecked()) {
            score ++;
        }

        if (score == 5){
            Toast.makeText(getApplicationContext(),
                    "Congratulations! Your score is = " + score, Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(getApplicationContext(),
                    "Keep on trying! Your score is = " + score, Toast.LENGTH_LONG).show();
        }

    }
}
