package sg.edu.rp.c346.id19011909.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    TextView tv;
    String[] fruit;
    ArrayList<String> fruits;

    String Data = "Fruits \n========== \n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        tv = findViewById(R.id.textView);

        //Setting Action {Array},
        fruit = new String[3];
        fruit[0] = "apple";
        fruit[1] = "banana";
        fruit[2] = "cherry";

        //Setting Action {ArrayList},
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        //Getting Second Element,
        String theFruit = fruits.get(1);

        //Removing First Element,
        fruits.remove(0);

        //Changing Last Element,
        fruits.set(2, "dragon fruit");

        //Displaying Variable {Array},
        for(int i = 0; i < fruit.length; i++)
        {
            //Data += fruit[i] + "\n";
        }

        //Displaying Variable {ArrayList},
        for(int i = 0; i < fruits.size(); i++)
        {
            Data += fruits.get(i) + "\n";
        }

        tv.setText(Data);

    }
}