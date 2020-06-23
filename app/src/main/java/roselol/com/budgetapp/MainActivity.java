package roselol.com.budgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // value for pinpad
    public static int value = 0; // starts at 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // manage all digit input and deletion
    public void digitInput(int digit){
        TextView input_value = findViewById(R.id.input_value);
        // backspace
        if(digit < 0){
            value /= 10;
        } else{
            // make sure no overflow
            if(value > 9999){
                return;
            }
            // create new value with digit
            value = (10 * value) + digit;
        }
        final String input = ""+value;
        input_value.setText(input);
    }

    // resets value and resets inputs
    public void resetValue(){
        TextView input_value = findViewById(R.id.input_value);
        value = 0;
        input_value.setText(value);
    }

    // manage digit inputs
    public void one(View view){
        digitInput(1);
    }
    public void two(View view){
        digitInput(2);
    }
    public void three(View view){
        digitInput(3);
    }
    public void four(View view){
        digitInput(4);
    }
    public void five(View view){
        digitInput(5);
    }
    public void six(View view){
        digitInput(6);
    }
    public void seven(View view){
        digitInput(7);
    }
    public void eight(View view){
        digitInput(8);
    }
    public void nine(View view){
        digitInput(9);
    }
    public void zero(View view){
        digitInput(0);
    }
    public void back(View view){
        digitInput(-1);
    }

    // manage storage
    public void food(View view){
        resetValue();
    }
    public void necessities(View view){
        resetValue();
    }
    public void cat(View view){
        resetValue();
    }
    public void happy(View view){
        resetValue();
    }
    public void savings(View view){
        resetValue();
    }
}
