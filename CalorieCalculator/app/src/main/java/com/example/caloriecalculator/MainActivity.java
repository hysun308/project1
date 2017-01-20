package com.example.caloriecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calculateCalories(View view){
        EditText editText = (EditText) findViewById(R.id.edit_exercises);
        Spinner mySpinner=(Spinner) findViewById(R.id.exercise_spinner);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);

        String exercise = mySpinner.getSelectedItem().toString();
        int exercise_time = Integer.parseInt(editText.getText().toString());
        int calories = 0;
        switch(exercise){
            case "Pushup" :
                if(radioButton.getText()=="mins"){
                    Toast.makeText(MainActivity.this,"Wrong Unit!!!",Toast.LENGTH_SHORT).show();
                    break;
                }
                calories = exercise_time*100/350;
                break;
            case "Situp" :
                if(radioButton.getText()=="mins"){
                    Toast.makeText(MainActivity.this,"Wrong Unit!!!",Toast.LENGTH_SHORT).show();
                    break;
                }
                calories = exercise_time*100/200;
                break;
            case "Jumping Jacks":
                if(radioButton.getText()=="reps"){
                    Toast.makeText(MainActivity.this,"Wrong Unit!!!",Toast.LENGTH_SHORT).show();
                    break;
                }
                calories = exercise_time*100/10;
                break;
            case "Jogging":
                if(radioButton.getText()=="reps"){
                    Toast.makeText(MainActivity.this,"Wrong Unit!!!",Toast.LENGTH_SHORT).show();
                    break;
                }
                calories = exercise_time*100/12;
                break;

        }
        TextView textView=(TextView)findViewById(R.id.text_calories);
        textView.setText(String.valueOf(calories)+" Calories");


    }
}
