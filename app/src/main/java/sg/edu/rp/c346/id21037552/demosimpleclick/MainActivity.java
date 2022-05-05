package sg.edu.rp.c346.id21037552.demosimpleclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //1 - create handles
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 - bridge UI with controller
        btnDisplay = findViewById(R.id.buttonDIsplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender); //null object errors

        //3 - set event listener
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //4 - set actions
                //grab input from editText
                //set to TextView
                //Code for the action
                String data = etInput.getText().toString();
                tvDisplay.setText(data);
                int selectedId = rgGender.getCheckedRadioButtonId();

                if (selectedId == R.id.radioButtonGenderMale){
                    tvDisplay.setText("He says " + data);
                } else {
                    tvDisplay.setText("She says " + data);
                }
            }
        });
        //Toggle button event listener
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tbtn.isChecked() == true){
                    btnDisplay.setEnabled(true);
                } else {
                    btnDisplay.setEnabled(false);
                }

            }
        });







    }
}