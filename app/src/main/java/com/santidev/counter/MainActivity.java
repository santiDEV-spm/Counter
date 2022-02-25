package com.santidev.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //variable del valor que vamos  a mostrar
    private int value = 0;

    //variables para los botones y textview
    private TextView textView;
    private Button btnAdd, btnMinus, btnGrow, btnShrink,btnHide,btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnGrow = (Button) findViewById(R.id.btnGrow);
        btnShrink = (Button) findViewById(R.id.btnShrink);
        btnHide = (Button) findViewById(R.id.btnHide);
        btnReset = (Button) findViewById(R.id.btnReset);


        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i("MAIN ACTIVITY", "onClick: " + view.getId());
        float scaleX;
        switch (view.getId()){
            case R.id.btnAdd:
                this.value++;
                this.textView.setText(""+this.value);
                break;
            case R.id.btnMinus:
                this.value--;
                this.textView.setText(""+this.value);
                break;
            case R.id.btnReset:
                this.value = 0;
                this.textView.setText(""+this.value);
                break;
            case R.id.btnGrow:
                scaleX = this.textView.getTextScaleX();
                scaleX += 1;
                this.textView.setTextScaleX(scaleX);
                break;
            case R.id.btnShrink:
                scaleX = this.textView.getTextScaleX();
                scaleX -= 1;
                this.textView.setTextScaleX(scaleX);
                break;
            case R.id.btnHide:
                if(this.textView.getVisibility() == View.VISIBLE){
                    //la vista esta visible y debemos ocultarla
                    textView.setVisibility(View.INVISIBLE);
                    btnHide.setText("Show");
                }else{
                    //LA VISTA ESTA INVISIBLE DEBEMOS MOSTRARLA
                    this.textView.setVisibility(View.VISIBLE);
                    btnHide.setText("Hide");
                }
                break;
        }

    }

}