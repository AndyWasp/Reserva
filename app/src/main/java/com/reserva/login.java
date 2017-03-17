package com.reserva;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by CECyT9 on 16/03/2017.
 */

public class login extends Activity implements OnClickListener
{

    EditText usr;
    EditText contra;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usr = (EditText) findViewById(R.id.usuarioE);
        contra = (EditText) findViewById(R.id.contraE);
    }

    public void onClick(View v) {

        TextView msj;
        Intent inAc = new Intent(this, MainActivity.class);
        Bundle info = new Bundle();
        Toast toast;

        msj = (TextView) findViewById(R.id.msj);
        msj.setText("YA ENTRO");


        if(usr.getText().toString().equals("Andy") && contra.getText().toString().equals("Winter")){

            info.putString("Usuario", usr.getText().toString().trim());
            inAc.putExtras(info);
            finish();
            startActivity(inAc);
            msj.setText("Datos Correctos");
            //toast = Toast.makeText(getApplicationContext(), "Datos correctos :3", Toast.LENGTH_SHORT);
        }else{

            msj.setText("Datos incorrectos");
            //toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
        }
    }

    /*public void acceso(View v)
    {

    }*/
}
