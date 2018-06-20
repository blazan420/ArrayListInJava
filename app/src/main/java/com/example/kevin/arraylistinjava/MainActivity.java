package com.example.kevin.arraylistinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtInitialCapacity = (TextView) findViewById(R.id.txtInitialCapacity);
        TextView txtArrayListValues = (TextView) findViewById(R.id.txtArrayListValues);
        TextView txtArrayListCapacityAfterAddingValues = (TextView) findViewById(R.id.txtArrayListCapacityAfterAddingValues);


        // Use this kind of array if I dont know the number of array elements
        ArrayList<String> animals = new ArrayList<String>();

        txtInitialCapacity.setText(animals.size() + "");

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Panther");
        animals.add("Bear");
        animals.add("Bird");
        animals.add("Fox");

        String oldTxtArrayListValues;
        /*for (int index = 0; index < animals.size(); index++) {

            oldTxtArrayListValues = txtArrayListValues.getText().toString();
            txtArrayListValues.setText(oldTxtArrayListValues + animals.get(index) + "     ");

        }*/

        txtArrayListCapacityAfterAddingValues.setText(animals.size() + "");

        animals.add("Dog");
        txtArrayListCapacityAfterAddingValues.setText(animals.size() + "");
        //outputTheArrayListValuesToTheScreenByUsingEnhancedForLoop(animals, txtArrayListValues);


        animals.add(0, "Wolf");
        //outputTheArrayListValuesToTheScreenByUsingEnhancedForLoop(animals, txtArrayListValues);

            animals.remove(2);
            outputTheArrayListValuesToTheScreenByUsingEnhancedForLoop(animals, txtArrayListValues);






    }

    public void outputTheArrayListValuesToTheScreenByUsingEnhancedForLoop(ArrayList<String> values,
                                                                          TextView textView) {
        String oldTxtViewValue;
        for (String value : values) { //Enhanced for loop

            oldTxtViewValue = textView.getText().toString();
            textView.setText(oldTxtViewValue + value + "    ");
        }
    }


}
