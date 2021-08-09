package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_messages;
    Button btn_add;
    EditText edt_message;
    ArrayList<String>message=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_messages=findViewById(R.id.lv_messages);
        btn_add=findViewById(R.id.btn_add);
        edt_message=findViewById(R.id.edt_message);
        ArrayAdapter<String> messages_Adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,message);
        lv_messages.setAdapter(messages_Adapter);


    }

    public void AddButtonAction(View view) {
        //Toast.makeText(this,edt_message.getText().toString(),Toast.LENGTH_SHORT).show();
        message.add(edt_message.getText().toString());
        edt_message.setText("");




    }
}