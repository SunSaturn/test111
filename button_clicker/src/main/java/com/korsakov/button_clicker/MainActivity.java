package com.korsakov.button_clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox cboxItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        cboxItIsNotMe = (CheckBox)  findViewById(R.id.cboxItIsNotMe);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("My number in the list is № 10.");
                reverseCheckBoxValue();
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
        private void reverseCheckBoxValue() {
            cboxItIsNotMe.setChecked(!cboxItIsNotMe.isChecked());
        }
        public void onItIsNotMeButtonClick(View view){
            textViewStudent.setText("It is not my work!");
            reverseCheckBoxValue();
        }

}